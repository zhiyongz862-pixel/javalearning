package demo;

public class object_me {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student stu1 = new Student(10,"zhangsan");
        Student stu2 = new Student(10,"zhangsan");
        // 会自动调用打印tostring方法中的内容
        java.lang.System.out.println(stu1);
        // 这里注意，如果用Object默认的equal方法，只会比较地址，如果想比较对象，就需要重写clone方法
        java.lang.System.out.println(stu1.equals(stu2));
        // clone方法
        // 1.需要重写clone方法
        // 2. 实现cloneable接口，表示我能clone
        //3. 捕获异常，强转，因为返回的是Object
        Student stu3 = (Student) stu2.clone();
    }
}
