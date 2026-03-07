package demo;

public class ThreeOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        //三元表达式一定要用，不能裸的写在那里 ，可以赋值给变量或者直接打印出来
        int c = a > b ? a: b;
        System.out.println(c);
        System.out.println(a > b ? a: b);



    }
}
