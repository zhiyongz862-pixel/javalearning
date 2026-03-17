package Demo;

// 子类要重写所有的构造方法
public class Student extends AbstractClass{


    public Student() {
    }

    public Student(String name ,int age) {
        super(name,age);
    }


    @Override
    public void work() {

    }

    public String toString() {
        return "Student{}";
    }
}
