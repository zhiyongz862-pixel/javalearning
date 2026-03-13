package Demo;

import java.util.ArrayList;

// array list 不能存储int这样的基本类型，但是java当中为这种基本类型设置了包装类
// int对应 Integer char 对应Character
public class ArrayListInt {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

    }
}
