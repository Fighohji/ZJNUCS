
import java.util.Scanner;

public class work4_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = new String();
        s = input.next();
        System.out.println(String.format("The length is %d.\nThe first charcter is %c.", s.length(), s.charAt(0)));
        input.close();
    }
}
