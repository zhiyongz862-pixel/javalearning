package Demo;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
/*
* 1.迭代器迭代到最后还next，会报错
* 2.迭代器 遍历完，指针不回报错，二次获得，只能再获得一个新的迭代器对象
* 3.循环中只能使用一次 next方法
* 4.在遍历的过程中不能使用集合的方法删除获得添加元素，但是可以在遍历的时候用迭代器的方法删除
* */
// 学习collection⚙及其子类如何遍历
// 1. 迭代器遍历 使用迭代器对象去做
public class InterDemo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String> ();
        c.add("aaa");
        c.add("bbb");
        // 通过调用这个方法得到iterator的对象
        Iterator<String>  s= c.iterator();
        // 看看是否有下一个对象
        //boolean flag = s.hasNext();
        //// 下一个对象是啥 这个方法做了 获取元素并移动指针
        //s.next();
        while(s.hasNext()){
            String str = s.next();
            // 这个是个无参数，是迭代器的方法，可以删除这个集合中的元素
            if ("bbb".equals(str)) {s.remove();}
        }
        System.out.println(c);
    }

}
