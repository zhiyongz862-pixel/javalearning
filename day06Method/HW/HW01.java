package HW;

import java.util.Scanner;

public class HW01 {
    public static void main(String[] args) {
        System.out.println("请入两个数字");
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble(), num2 = sc.nextDouble();
        double ans = compare(num1,num2);
        System.out.println("小的数字为" + ans);

    }
    public static  double compare(double a, double b){
        return a>b ? b:a;
    }
}
