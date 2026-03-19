package Demo;

import java.util.ArrayList;
import java.util.List;

public class ListAdd {
    public static void main(String[] args) {
        List<Integer> list  = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // 这里默认删除1位置 也就是2那个元素
        //list.remove(1);

        Integer x = Integer.valueOf(1);
        // 这个就是第一位了
        list.remove(x);
        System.out.println(list);
    }
}
