package Demo;

public interface DefaultInterface {
    public default  void show(){
        // 设施默认方法 这个方法可以在后续不重写 这个特性感觉接口就跟类一样了
        // 这个东西不能有二义性，如果下面有人实现了两个接口，两个接口都有default的重名方法，一定要重写，避免二义性
        // 后面有类实现这个方法，也可以直接通过对象调用这个方法
        System.out.println("接口中的默认方法");
    }
    // 静态方法不能在下面被重写，可以直接通过接口调用
    static  void show1(){
        System.out.println("静态方法");
    }
    // 私有方法，为其他default方法服务，记录其他的重复代码
    private  void log(){}
}
