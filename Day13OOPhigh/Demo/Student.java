package Demo;
//  标准的javebean类
// 静态对象的几个原则
// 静态方法没有this关键字->this关键字指向一个对象，但是static是共享的
// 静态方法中，只能访问静态
// 非静态方法可以访问所有
// 静态对象随着类的加载而加载
public class Student {
    private  String name;
    private  int age;
    // 这个static代表这个是类对象，可以通过类访问
    public static  String teacher;

    public Student() {
    }

    public Student(String name, int age, String teacher) {
        this.name = name;
        this.age = age;
        this.teacher = teacher;
    }

    /**
     * 获取
     * @return teacher
     */
    public static String getTeacher() {
        return teacher;
    }

    /**
     * 设置
     * @param teacher
     */
    public static void setTeacher(String teacher) {
        Student.teacher = teacher;
    }

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
        return "Student{name = " + name + ", age = " + age + ", teacher = " + teacher + "}";
    }
}
