package Demo;

import java.util.Scanner;

// IF语句的学习
public class IfStructure {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入女婿的酒量");
        int x = sc.nextInt();
        //关系表达式 建议大括号贴着写，写在前一行的末尾
        //一句代码大括号可以省略不写,但是尽量都写上
        if (x>2){//如果说上面是真，就执行，否则就不执行
            System.out.println("x的值大于2，if的第一种形式的学习");
            System.out.println("小伙子酒量不错");
        }

        //对于布尔变量进行判断，建议不要用==号  直接写在小括号中，这样更加简便
        boolean flag = false;
        if (flag) {
            System.out.println("直接使用boolean变量作为条件表达式即可");
        }

    }
}
