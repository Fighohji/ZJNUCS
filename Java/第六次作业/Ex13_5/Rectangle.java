package Ex13_5;

public class Rectangle extends GeometricObject {
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
    @Override
    public double getArea() {
        return height * width;
    }
    @Override
    public double getPerimeter() {
        // TODO Auto-generated method stub
        return (height + width) * 2;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "this rectangle\'s height is " + height + " width is " + width;
    }

}
