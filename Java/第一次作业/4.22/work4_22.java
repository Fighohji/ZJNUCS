
import java.util.Scanner;

public class work4_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1 = new String();
        String s2 = new String();
        System.out.print("Enter string s1: ");
        s1 = input.next();
        System.out.print("Enter string s2: ");
        s2 = input.next();
        if (s1.contains(s2)) {
            System.out.println(String.format("%s is a substring of %s.", s2, s1));
        } else{
            System.out.println(String.format("%s is not a substring of %s.", s2, s1));
        }
        input.close();
    }
}
