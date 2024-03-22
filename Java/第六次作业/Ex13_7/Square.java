package Ex13_7;

public class Square extends GeometricObject implements Colorable {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Square() {
        this.side = 0;
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return side * side;
    }

    @Override
    public double getPerimeter() {
        // TODO Auto-generated method stub
        return 4 * side;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "The square's side is " + side;
    }

    @Override
    public void howToColor() {
        // TODO Auto-generated method stub
        System.out.println("Color all four sides");
    }
    
}
