public class Queue {
    private int[] element;
    private int size;
    private int maxSize;
    public Queue() {
        maxSize = 8;
        element = new int[maxSize];
        size = 0;
    }
    void enqueue(int val) {
        if (size == maxSize) {
            int[] tmp = element;
            element = new int[maxSize << 1];
            for (int i = 0; i < maxSize; ++i)
                element[i] = tmp[i];
            maxSize <<= 1;
        }
        element[size++] = val;
    }
    int dequeue() {
        int res = element[0];
        for (int i = 1; i < size; ++i)
            element[i - 1] = element[i];
        size--;
        return res;
    }
    boolean empty() {
        return size == 0;
    }
    int getSize() {
        return size;
    }
}
