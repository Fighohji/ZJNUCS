package Ex13_7;

public class Ex13_7 {
    public static void main(String[] args) {
        Square[] list = new Square[5];
        list[0] = new Square("a", false, 1);
        list[1] = new Square("e", false, 1);
        list[2] = new Square("d", true, 1);
        list[3] = new Square("c", true, 3);
        list[4] = new Square("b", false, 1);
        for (int i = 0; i < 5; ++i) {
            System.out.println(list[i]);
            if (list[i].isFilled()) {
                list[i].howToColor();
            }
        }
    }
}
