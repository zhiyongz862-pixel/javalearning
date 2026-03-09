// 变量的范围和驼峰命名法
package  Demo;
public class variableDemo3{

    public static void main(String[] args){
        //boolean 变量
        boolean t = true;
        //正确的 byte -128到127
        byte b = 30;
        //错误的byte
        //byte b = 200;

        //short的范围 负的2的15次方 ~ 2的15次方-1(-32768~32767)
        short c = 200;

        //int 范围 负的2的31次方 ~ 2的31次方-1
        int d = 3000;

        //long 负的2的63次方 ~ 2的63次方-1
        // 如果要定义long类型变量，后面必须加个L作为后缀，这个L可以大写也可以小写，但是建议大写
        long n = 9999999999L;
        System.out.println(n);

        // float 定义需要后缀 F
        float f = 10.1F;
        //double 不需要后缀
        double D = 300.90;
        // 驼峰命名法
        int a = 10;
        // 类名 变量名 方法名都是标识符
        //小驼峰命名法，方法和变量命名 单个单词全部小写 多个单词，从第二个单词开始，其他字母全部大写
        int firstName = 200;
        //  大驼峰命名法 用于类,单个单词，首字母大写。多个单词，每个单词首字母都大写
        //GoodStudent





    }

}