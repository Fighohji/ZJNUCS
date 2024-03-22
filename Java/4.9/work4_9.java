
import java.util.Scanner;

public class work4_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char c = input.next().charAt(0);
        System.out.println(String.format("The Unicode for the charcter %c is %d", c, (int)c));
        input.close();
    }
}
