package demo;
//这个是练习java操作数的
public class operator {
    public static void main(String[] args) {
        System.out.println(3 + 2);
        System.out.println(3 - 2);
        System.out.println(3 * 2);

        //小数运算可能不精确 浮点数精度丢失
        System.out.println(1.01 + 1.1);

        // 除法 java当中除法也是整除
        System.out.println(10 / 2);
        System.out.println(10 / 3);
        System.out.println(10.0 / 3);
        //  取余数
        System.out.println(10 % 2 );

    }
}
