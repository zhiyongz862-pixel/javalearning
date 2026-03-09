package demo;

import java.util.Scanner;

public class operatorExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数字");
        int x = sc.nextInt();
        System.out.println(x % 10);
        x = x / 10;
        System.out.println(x % 10);
        x = x / 10;
        System.out.println(x % 10);

    }
}
