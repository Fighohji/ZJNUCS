import java.util.Arrays;
import java.util.Scanner;
public class Ex4_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] order = new String[] {"first", "second", "third"};
        String[] city = new String[3];
        for (int i = 0; i < 3; ++i) {
            System.out.print(String.format("Enter the %s city:", order[i]));
            city[i] = input.nextLine();
        }
        Arrays.sort(city);
        input.close();;
        System.out.print("The three cities in alphabetical order are");
        for (int i = 0; i < 3; ++i) {
            System.out.print(String.format(" %s", city[i]));
        }
    }
}
