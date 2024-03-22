package Ex13_6;

public class Ex13_6 {
    public static void main(String[] args) {
        ComparableCircle a = new ComparableCircle(2);
        ComparableCircle b = new ComparableCircle(3);
        System.out.println(a.compareTo(b) > 0 ? a : b);
    }
}
