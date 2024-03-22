package Ex12_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex12_2 {
    public static void main(String[] args) throws InputMismatchException {
        Scanner input = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("enter 2 numbers:");
                int x = input.nextInt();
                int y = input.nextInt();
                System.out.println(x + y);
                break;
            } catch(InputMismatchException ex) {
                System.out.println("wrong input " + ex);
                input.nextLine();
            }
        }
        input.close();
    }
}
