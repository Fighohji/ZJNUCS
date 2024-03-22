import java.security.SecureRandom;
import java.util.ArrayList;

public class Ex7_13 {
    static SecureRandom randomdevice = new SecureRandom();
    public static void main(String[] args) {
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 15; ++j)
                System.out.print(String.format("%4d", getRandom(1, 100, 4, 8, 95, 93)));
            System.out.println("");
        }
    }
    public static Integer getRandom(int start, int end, int ... numbers) {
        ArrayList<Integer> selectNumers = new ArrayList<Integer>();
        for (int i = start; i <= end; ++i) {
            boolean flag = true;
            for (int j : numbers) {
                if (i == j) {
                    flag = false;
                    break;
                }
            }
            if (flag) selectNumers.add(i);
        }
        return selectNumers.get(randomdevice.nextInt(selectNumers.size()));
    }
}