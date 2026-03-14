package Demo;
// 工具类 见名知意
// 类对象构造方法要用private，因为创建这个对象没有意义
// 方法定义为static 方便调用
public class UtilClass {
    private  UtilClass(){}
    public static String printArr(int [] a){
        System.out.println("实现工具类打印数组");
        return "";
    }
}
