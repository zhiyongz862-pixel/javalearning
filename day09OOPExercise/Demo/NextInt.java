package Demo;

import java.util.Scanner;

public class NextInt {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        // 输入 123 123 打印两额123 因为空格代表这个next终止
        System.out.println("请输入一个整数");
        int num1= sc.nextInt();
        System.out.println(num1);
        System.out.println("请输入一个整数");
        int num2 = sc.nextInt();
        System.out.println(num2);




    }
}
