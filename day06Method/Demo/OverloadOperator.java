package Demo;

//这个是学习函数重载的
//同一个类中，定义多个同名方法，参数不同（包括数目、参数类型和参数顺序） 和返回值无关
//参数顺序不同比如先int后double和先double后int
public class OverloadOperator {
    public static void main(String[] args) {

    }
    public static  int sum(int a,int b){
        return a+b;
    }
    public  static  double sum(double a,double b){
        return a+b;
    }
    public static  int sum(int a,int b,int c){
        return a+b+c;
    }

    //下面这个就不行 因为只有参数不同才能算重载 下面这个会报错
    //public static  void sum(int a,int b){
    //
    //}

}
