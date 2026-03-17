package Intraclass;

public class AnonymousIntraClass {
    public static void main(String[] args) {
        // 匿名内部类 作用就是简便。 比如一个子类我只想用一次，那么就在这定义即可 下面这个整体就是个对象 {} 内部中是一个类
        // 前面的new代表创建这个对象 Swim（）代表继承自
        new Swim(){
            @Override
            public void swim() {
                System.out.println("重写了有用的方法");
            }
        };
    }
}
