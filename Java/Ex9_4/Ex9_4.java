package Ex9_4;

import java.util.Random;

public class Ex9_4 {
    public static void main(String[] args) {
        Random randomdevice = new Random(1000);
        for (int i = 0; i < 5; ++i) {
            for (int j = 0; j < 10; ++j) {
                System.out.print(String.format("%4d", randomdevice.nextInt(100)));
            }
            System.out.println();
        }
    }
}
