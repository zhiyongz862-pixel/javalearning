package Demo;
//抽象类不能实例话
// 抽象类和抽象方法的定义，只要有一个抽象方法，必须设置为抽象类
// 但是抽象类不一定有抽象方法 ，但是抽象类可以有构造方法(因为子类可以通过super方法给这个赋值)
// 抽象类子类要么重写所有抽象方法，要么也是抽象类
public abstract  class AbstractClass {
    private String name;
    private int age ;

    public AbstractClass() {
    }

    public AbstractClass(String name, int age) {
        this.name = name;
        this.age = age;
        //int a = 10;
    }

    public abstract  void work();

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "AbstractClass{name = " + name + ", age = " + age + "}";
    }
}
