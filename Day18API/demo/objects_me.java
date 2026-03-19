package demo;

import java.util.Objects;

// objects这个类 全是static对象，他的equal可以传入两个参数，防止有一个参数为空 导致s1.equal报错
public class objects_me {
    public static void main(String[] args) {
        Student s1 = null;
        Student s2 = new Student();
        // 报错
        //s1.equals(s2);

        Objects.equals(s1,s2);
        // 判断这个是不是null
        Objects.isNull(s1);
    }
}
