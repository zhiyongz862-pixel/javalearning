package demo;

public class LogicOperator {
    public static void main(String[] args) {
        int x = 15;
        // 逻辑与 两边都为真 才为真
        boolean ans = true & false;
        //或者运算
        boolean ans_1 = true | false;
        //异或运算
        System.out.println(true ^ true);
        //非运算
        System.out.println(! true);

        //短路逻辑与运算
        System.out.println(true && false );

    }
}
