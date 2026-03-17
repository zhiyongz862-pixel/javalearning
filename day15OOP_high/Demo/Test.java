package Demo;

public class Test {
    public static void main(String[] args) {
        // 报错抽象类不能实例化
        //AbstractClass a = new AbstractClass();
        Student s = new Student("zhangsan",14);
        System.out.println(s.getAge());
    }
}
