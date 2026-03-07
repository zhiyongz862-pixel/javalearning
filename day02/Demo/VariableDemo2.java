// 变量的进阶用法
package  Demo;
public class VariableDemo2{

    public static  void main(String[] args)
    {
        //变量的基本用法 定义变量并打印
        int  a = 10;
        System.out.println(a);

        //错误 a不能重复定义
        //int a = 10,b=20;
        int b = 20;
        System.out.println(a + b);

        //修改变量的记录
        a = 30;

        // 一行可以定义多个变量
        int c = 100,d =200;

        //变量在使用之前必须赋值
        int x;
        //System.out.println(x); //这个就会报错

        //10进制 8进制 2进制 16进制
        int x1 = 17,x2 = 017, x3 = 0b110,x4 =  0x123;
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
            System.out.println(x4);
    }

}