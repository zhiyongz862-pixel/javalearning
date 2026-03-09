package Demo;

import java.util.Scanner;

public class HuiWen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int x = sc.nextInt();
        int temp = x ,y = 0;
        while(temp!=0){
            y = y*10 + temp%10;
            temp = temp / 10;
        }
        boolean flag = true;
        while(x!=0){
            if(y%10 != x%10){
                flag = false;
                break;
            }
            x = x/10;
            y = y/10;
        }
        System.out.println(flag);



    }
}
