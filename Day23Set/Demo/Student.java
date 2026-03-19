package Demo;
// 红黑树的compareto习惯
import java.util.Comparator;
import java.util.Objects;

public class Student implements Comparable<Student>{
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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
        return "Student{name = " + name + ", age = " + age + "}";
    }




    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }
    // 自定义类只有重写了这个接口才能 加入到Treeset（自然排序法）
    @Override
    public int compareTo(Student o) {
        //return 0;
        //这样写是升序 负数，当前添加的元素是小的，要存在左边
        // 返回0 证明已经有了，就把这个舍弃
        return this.age - o.age;
    }
    //   重写了hashcode方法之后 相同对象的哈希值就一样了
    //@Override
    //public int hashCode() {
    //    return Objects.hash(name, age);
    //}
}
