package Demo;
// 标准的测试类 有main函数 测试所有的类
public class TestStatic {
    public static void main(String[] args) {
        // 静态方法可以直接用.访问
        Student.teacher = "maliu";
        //  可以在构造函数函数中覆盖
        Student s = new Student("zhangsan",124,"wangwu");
        System.out.println(Student.teacher);

    }
}
