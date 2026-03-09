package HW;

import java.util.Scanner;

public class HW02 {
    public static void main(String[] args) {
        /* 让用户依次录入三个整数，求出三个数中的最小值，并打印到控制台。*/
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int temp = x > y ? x:y;
        int ans = temp>z? temp:z;
        System.out.println(ans);

    }
}
