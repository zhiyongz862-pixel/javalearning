package hw;

import java.util.Scanner;

public class hw07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int in = sc.nextInt();
        int ge = in % 10;
        int shi = (in / 10) % 10;
        int bai = (in /100) % 100;
        System.out.println(ge + shi + bai);


    }
}
