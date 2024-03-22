

import java.util.Scanner;

public class work2_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x1, x2, y1, y2;
        System.out.print("Enter x1 and y1: ");
        x1 = input.nextDouble(); y1 = input.nextDouble();
        System.out.print("Enter x2 and y2: ");
        x2 = input.nextDouble(); y2 = input.nextDouble();
        System.out.print("The distance between the two points is ");
        System.out.print(GetDistance(x1, y1, x2, y2));
        input.close();
    }
    private static double GetDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
    }
}
