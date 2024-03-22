package Ex13_9;

public abstract class GeometricObject implements Comparable<GeometricObject> {
    private String color;
    private boolean filled;
    public GeometricObject() {

    }
    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public abstract double getPerimeter();
    public abstract double getArea();
    public abstract String toString();
    @Override
    public int compareTo(GeometricObject o) {
        return (int)(this.getArea() - o.getArea());
    }
    public static GeometricObject max(GeometricObject a, GeometricObject b) {
        return a.compareTo(b) > 0 ? a : b; 
    }
}
