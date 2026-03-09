package Demo;

import java.util.Scanner;

public class IfElseStructure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入身上的钱财");
        double money = sc.nextInt();
        if (money >= 100){
            System.out.println("吃网红餐厅");
        } else{
            System.out.println("吃沙县大酒店");
        }

    }
}
