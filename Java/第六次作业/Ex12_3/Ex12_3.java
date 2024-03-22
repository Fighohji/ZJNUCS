package Ex12_3;

import java.util.Scanner;

public class Ex12_3 {
    public static void main(String[] args) {
        int[] a = new int[100];
        for (int i = 0; i < 100; ++i) {
            a[i] = (int)(Math.random() * 100);
        }
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("输入一个小于100的非负整数: ");
            int x = input.nextInt();
            System.out.println(a[x]);
        } catch(ArrayIndexOutOfBoundsException ex) {
            System.out.println("Out of Bounds");
        }
        input.close();
    }
}
