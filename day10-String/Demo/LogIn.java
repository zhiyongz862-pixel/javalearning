package Demo;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str1 = sc.next();
        String str2 = "abc";
        // 即便输入一样 二者也不一样 因为next就是new出来的
        // 只要想比较内容 必须用equal方法
        System.out.println(str1 == str2);

        for (int i = 0;i<3;i++) {
            System.out.println("包裹练习");
        }
    }
}
