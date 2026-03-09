package Demo;

import java.util.Scanner;

//if else if 的结构
public class IfElseIFStructure {
    public static void main(String[] args) {
        //小明的礼物
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if (score >= 95 && score <= 100){
            System.out.println("送自行车一辆");
        }else if(score>= 90  && score<95) {
            System.out.println("送变形金钢一个");
        }else{
            System.out.println("揍一顿");
        }

    }
}
