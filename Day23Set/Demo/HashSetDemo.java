package Demo;

public class HashSetDemo {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan",14);
        Student s2 = new Student("zhangsan",14);
        // 不重写，对象值一样hash值就不一样（因为地址不一样，正常的hashcode方法根据地址生成），重写后对象属性相同，hash值就相同

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

    //     哈希表添加，如果哈希冲突，先比较对象是否相等，相等，就不添加，否则，就挂在新元素下面
    }
}
