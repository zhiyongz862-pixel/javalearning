package demo;

//相加规则
public class TypeTransform {
    public static void main(String[] args) {
        // 数字进行运算时，数据类型要是一样的
        //这里会自动类型提升（隐式类型转换） 取值小的自动转换为取值大的
        //byte short char都会先转换为int
        int a = 10;
        double b = 12.3;
        double c = a + b;
        System.out.println(c);
        // 强制类型转换 但是可能会出错
        //对的
        a = (int) b;

        int u = 300;
        //转换可能丢失精度
        byte v = (byte) u;

        byte b1 = 10 ;
        byte b2 = 20 ;
        //出错 因为右边是int类型
        //byte result = b1 + b2;
        // 错误的 因为转换为byte，在运算时还是会变为int，所以只能在结果变化
        //byte result = (byte) b1 + (byte) b2;
        //正确的
        byte result = (byte) (b1 + b2);

        System.out.println(result);



    }
}
