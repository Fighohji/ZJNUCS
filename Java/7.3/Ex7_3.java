import java.util.Scanner;

public class Ex7_3 {
    public static void main(String[] args) {
        int[] bucket = new int[101];
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Enter the integers between 1 and 100: ");
        while ((number = input.nextInt()) > 0) {
            bucket[number]++;
        }
        for (int i = 1; i <= 100; ++i) {
            if (bucket[i] == 0) continue;
            System.out.println(String.format("%d occurs %d time%c",i, bucket[i], bucket[i] > 1 ? 's' : 0));
        }
        input.close();        
    }
}
