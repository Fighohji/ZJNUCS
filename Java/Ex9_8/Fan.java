package Ex9_8;

public class Fan {
    public static int SLOW = 1;
    public static int MEDIUM = 2;
    public static int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    Fan() {
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }
    public int getSpeed() {
        return speed;
    }
    public boolean isOn() {
        return on;
    }
    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }
    public void setSpeed(int _speed) {
        speed = _speed;
    }
    public void setOn(boolean _on) {
        on = _on;
    }
    public void setRadius(double _radius) {
        radius = _radius;
    }
    public void setColor(String _color) {
        color = _color;
    }
    public String toString() {
        String sp;
        if (speed == 1) sp = "SLOW";
        else if (speed == 2) sp = "MEDIUM";
        else sp = "FAST";
        return on ? String.format("Fan\'s speed is %s, color is %s, radius is %f", sp, color, radius) : "The fan is off";
    }
}
