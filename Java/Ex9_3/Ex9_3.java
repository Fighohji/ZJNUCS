package Ex9_3;

import java.util.Date;

public class Ex9_3 {
    public static void main(String[] args) {
        long time = 1000;
        for (int i = 0; i < 8; ++i) {
            time *= 10;
            Date dt = new Date(time);
            System.out.println(String.format("Set time to %d, the date is %s", time, dt.toString()));
        }
    }
}
