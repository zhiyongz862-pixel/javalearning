package HW;

import java.util.Scanner;
//绝对值函数
public class HW04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(abs(sc.nextDouble()));

    }
    public static  double abs(double x){
        if (x >=0) return x;
        else return -x;
    }
}
