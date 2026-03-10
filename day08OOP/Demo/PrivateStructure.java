package Demo;

//学习Private关键字
//被private修饰的成员只能在本类中才能访问，对象也不能访问
public class PrivateStructure {
    private String name;
    private int age;
    private String gender;

    //public void setAge(int a) {
    //    if (a >= 18 && a <= 50) {
    //        age = a;
    //    } else {
    //        System.out.println("非法数据");
    //    }
    //}
    // java是就近原则，上面那个如果换成age，必须用this指针指向当前对象
    public void setAge(int age) {
        if (age >= 18 && age <= 50) {
            this.age = age;
        } else {
            System.out.println("非法数据");
        }
    }

    public int getAge() {
        return age;
    }
}
