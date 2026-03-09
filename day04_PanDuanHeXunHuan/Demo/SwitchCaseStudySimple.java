package Demo;

import java.util.Scanner;
// switch的匹配值可以逗号后面跟多个值
public class SwitchCaseStudySimple {
    public static void main(String[] args) {
//分析：
        //1.键盘录入星期数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期");
        int week = sc.nextInt();//3
        //2.利用switch进行匹配
        //典型的利用case穿透，没有遇到break就会在第一个语匹配句执行后一直执行，直到遇到breaks
        switch (week){
            case 1,2,3,4,5:
                System.out.println("工作日");
                break;
            case 6,7:
                System.out.println("休息日");
                break;
            default:
                System.out.println("没有这个星期");
                break;
        }    }
}
