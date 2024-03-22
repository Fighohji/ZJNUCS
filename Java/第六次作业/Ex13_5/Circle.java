package Ex13_5;

public class Circle extends GeometricObject{
    private double radius;
    
    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return Math.PI * radius * radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        // TODO Auto-generated method stub
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Circle\'s radius is " + radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
}
