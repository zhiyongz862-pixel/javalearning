package Demo;
//构造方法，给成员对象进行复制
public class ConstructStructure {
    private String name;
    private  int age;
    // 构造方法不能写返回值类型，只起到赋初始值的作用
    // 如果没写构造函数虚拟机会自动创建，但是只要写了一个就不会自动创建了
    //构造函数不能调用，只能在创建对象的时候虚拟机自动调用
    public ConstructStructure(){

    }
    public ConstructStructure(String name ,int age){}
}
