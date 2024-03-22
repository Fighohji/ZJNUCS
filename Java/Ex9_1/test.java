package Ex9_1;

public class test {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(4, 40);
        Rectangle rec2 = new Rectangle(3.5, 35.9);
        System.out.println(String.format("Rectangle1 width is %f, height is %f, area is %f, perimeter is %f", 
                                         rec1.getWidth(), rec1.getHeight(), rec1.getArea(), rec1.getPerimeter()));
        System.out.println(String.format("Rectangle2 width is %f, height is %f, area is %f, perimeter is %f", 
                                         rec2.getWidth(), rec2.getHeight(), rec2.getArea(), rec2.getPerimeter()));

    }
}
