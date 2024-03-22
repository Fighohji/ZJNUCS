package Ex9_1;

public class Rectangle {
    private double height, width;
    Rectangle() {
        width = 1;
        height = 1;
    }
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    double getArea() {
        return width * height;
    }
    double getPerimeter() {
        return (width + height) * 2;
    }
}
