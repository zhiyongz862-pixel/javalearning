package Demo;
//定义类 描述事物的类，也叫javabean类
//类名必须跟文件名一样
public class Phone {
    //手机名字
    String brand;
    //手机价格
    double price;
    //  这里就不用static
    public void call(){
        System.out.println("手机打电话");
    }
    public void playGame(){
        System.out.println("玩游戏");
    }
}
