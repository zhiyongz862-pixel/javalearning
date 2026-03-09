
//主要学习常量的使用
package  Demo;
public class testconst {
    public static void  main(String[] args)
    {
//        常见的数据类型在代码中这样书写
        // 整数
        System.out.println(11);
        System.out.println(777);

        // 小数
        System.out.println(1.93);
        System.out.println(-3.71);

        //字符串
        System.out.println("我是一个字符串");
        System.out.println("我是第二个字符窜");

        //字符
        System.out.println("男");
        System.out.println("女");

        //bool类型
        System.out.println(true);
        System.out.println(false);

        //null是不能直接打印的
        System.out.println("null");
        System.out.println();

        //\t把字符串长度补齐到8或者8的倍数
        //注意 可能在notepadd++是8 但是在IDEA里面是补到4的倍数
        //作用，打印表格数据的时候对齐，更好看
        System.out.println("name" + "\t" + "age");
        System.out.println("tom12" + "\t" + "23");
        //System.out.println("kkk" + '\t');



    }


}