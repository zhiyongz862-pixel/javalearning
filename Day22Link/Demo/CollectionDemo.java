package Demo;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        // Collection是顶层接口，因此无法直接创建他的对象，但是可以用多态的形式创建
        Collection<String> c = new ArrayList<String>();

        // List 添加永远返回true，set可能会返回false，因为set可能会添加失败 这个添加会有个返回值
        c.add("aaa");
        c.add("aca");
        c.add("ada");
        c.add("aka");

        // 也会返回是否删除成功
        c.remove("aaa");

        // 删除所有元素
        c.clear();

        // 是否包含 细节，底层依赖equals方法，如果是自定义对象，要重写equals方法
        c.contains("akd");

    }
}
