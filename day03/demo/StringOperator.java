package demo;

public class StringOperator {
    public static void main(String[] args) {
        // + 的过程中，只要有字符串，就是字符串拼接，字符串优先级最高
        // 字符串当中，+号是字符串的拼接
        String a = "123";
        // "123123"
        System.out.println("123" + 123);
        // 100年黑马 他会先做整数的加法运算 从左往右执行，不能跳步
        System.out.println(1+ 99 + "年黑马");
        //这个就是199了，因为字符串转换运算在前
        System.out.println( "年黑马"+ 1+ 99 );
        int age = 18;
        //变量不符合上面的规则
        System.out.println("我的年龄是" + age + "岁");
        System.out.println("我的年龄是" + "age" + "岁");

        // 字符运行会自动转换为 int去运算
        char z = '中';
        System.out.println(z + 1);

    }
}
