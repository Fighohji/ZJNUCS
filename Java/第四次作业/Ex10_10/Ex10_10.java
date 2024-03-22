public class Ex10_10 {
    public static void main(String[] args) {
        Queue q = new Queue();
        for (int i = 1; i <= 20; ++i)
            q.enqueue(i);
        while (q.empty() == false) {
            System.out.print(q.dequeue() + " ");
        }
    }
}
