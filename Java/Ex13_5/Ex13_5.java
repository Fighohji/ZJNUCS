package Ex13_5;

public class Ex13_5 {
    public static void main(String[] args) {
        Triangle a = new Triangle(5, 3, 4);
        Triangle b = new Triangle(2, 2, 2);
        Circle c = new Circle(1);
        Circle d = new Circle(2);
        System.out.println("max triangle is " + GeometricObject.max(a, b).toString());
        System.out.println("max cir is " + GeometricObject.max(c, d));
    }
}
