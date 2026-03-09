package HW;

import java.util.Scanner;

public class HW02 {
    public static void main(String[] args) {
        System.out.println("请输入三个整数");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        System.out.println("最大值为" + getMax(a,b,c));

    }
    public static  int getMax(int a,int b, int c){
        int temp = a>b ? a:b;
        return temp>c ? temp:c;
    }
}
