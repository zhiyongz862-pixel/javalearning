package Demo;

// 接口就是一种规范，侧重于要干的活 是对行为的抽象
// 接口不能实例化
// 接口和类是实现关系，一个类可以实现多个接口
public interface Swim {
    // 接口中的成员变量默认是public static final
    // 没有构造方法
    public static  final int ss = 0;
    //  接口方法默认是抽象的
    public abstract  void swim();

}
