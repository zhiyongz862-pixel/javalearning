package Demo;

import java.util.Scanner;

public class CountModThreeModFive {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个数字");
        int num2 = sc.nextInt();
        int ans = 0;
        for (int i = num1; i <= num2; i++) {
            if(i % 3 == 0 && i % 5 == 0){
                ans++;
            }
        }
        System.out.println(ans);

    }
}
