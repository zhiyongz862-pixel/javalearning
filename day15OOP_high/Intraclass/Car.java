package Intraclass;

public class Car {
    String carName;
    int carAge;
    String carColor;
    public void show(){
        Engine e = new Engine();
        // 外部类要访问内部类的成员，必须要创建内部类的对象
        System.out.println(e.engineAge);
    }
    // 定义在类中的类，叫内部类 ，内部类可以直接访问外部类的成员，包括私有。或者这个叫成员内部类
    // 现有Car 再有发动机，所以要设计内部类
    class Engine{
        String engineName;
        int engineAge;

        public void show(){
            System.out.println(carName);
        }
    }
}
