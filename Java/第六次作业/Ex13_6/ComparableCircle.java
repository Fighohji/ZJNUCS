package Ex13_6;

public class ComparableCircle extends Circle implements Comparable<Circle>{
    public ComparableCircle() {

    }
    public ComparableCircle(double radius) {
        super(radius);
    }
    @Override
    public int compareTo(Circle o) {
        // TODO Auto-generated method stub
        return this.getArea() - o.getArea() > 0 ? 1 : -1;
    }

    @Override
    public String toString() {
        return String.format("ComparableCircle [radius is %f]", this.getRadius());
    }
    
}
