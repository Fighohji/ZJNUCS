package Ex13_9;

public class Circle {

    private double radius;
    public Circle() {
        
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle []";
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        if (obj == this) return true;
        if (! (obj instanceof Circle)) return false;
        return this.radius == ((Circle)obj).radius;
    }
    
}
