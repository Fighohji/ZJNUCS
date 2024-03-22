package Ex13_1;

import java.util.Scanner;

public class Ex13_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入三角形第一条边：");
        double a = input.nextDouble();
        System.out.print("请输入三角形第二条边：");
        double b = input.nextDouble();
        System.out.print("请输入三角形第三条边：");
        double c = input.nextDouble();
        System.out.print("请输入三角形的颜色：");
        String col = input.next();
        System.out.print("请输入三角形是否被填充：");
        boolean flag = input.nextBoolean();
        Triangle triangle = new Triangle(a, b, c);
        triangle.setColor(col);
        triangle.setFilled(flag);
        System.out.println(triangle.toString());
        System.out.println("Area is " + triangle.getArea() + " Perimeter is " + triangle.getPerimeter());
        input.close();
    }
}
