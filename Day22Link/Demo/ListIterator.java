package Demo;

import java.util.ArrayList;
import java.util.List;
// 列表迭代器
public class ListIterator {
    public static void main(String[] args) {
        List<String> s = new ArrayList<>();
        s.add("aaa");
        s.add("bbb");
        s.add("ccc");

        java.util.ListIterator<String> stringListIterator = s.listIterator();
        while (stringListIterator.hasNext())
        {
            String str = stringListIterator.next();
            if ("bbb".equals(str)){
                // 可以用迭代器本身的方法，如果用List的方法就会报并发错误
                stringListIterator.add("qqq");
            }
        }


    }
}
