
import java.security.SecureRandom;
public class work3_4 {
    public static void main(String[] args) {
        String[] Month = {"January", "Febuary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        SecureRandom randomdevice = new SecureRandom();
        int num = randomdevice.nextInt(12);
        System.out.println(String.format("The random month is %s", Month[num]));
    }
}
