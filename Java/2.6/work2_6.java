import java.util.Scanner;

public class work2_6 {
    public static void main(String[] args) {;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt();
        if (number >= 0 && number <= 1000) {
            System.out.print("The sum of the digits is ");
            System.out.print(GetDigitSum(number));
        } else {
            System.out.println("the input is incorrect");
        }
        input.close();
    }
    private static int GetDigitSum(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
