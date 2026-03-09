package Demo;
// 学习java当中怎么定义调用方法
public class MethodStructure {
    public static void main(String[] args) {
        print1();
        getSum(20,30);
        System.out.println(calSum(20,30));


    }
    //最简单的无参数无返回值方法
    public static  void print1(){
        System.out.println("最简单的无参数无返回值方法");
    }
    // 参数要说明类型
    public static void getSum(int num1,int num2){
        System.out.println(num1 + num2);
    }
    public static int calSum(int num1,int num2){
        return num1 + num2;
    }
}
