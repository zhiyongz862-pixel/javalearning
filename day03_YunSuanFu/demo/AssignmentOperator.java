package demo;

public class AssignmentOperator {
    public static void main(String[] args) {
            int a = 10;
            int b = 20;
            //等价于 a = (int)(a + b) 会做一步强制类型转换，类别为
            a += b;
        System.out.println(a);
        System.out.println(b);

        short s = 1;
        //强制类型转换，转换为了short
        s += 1;
        System.out.println(s);

    }
}
