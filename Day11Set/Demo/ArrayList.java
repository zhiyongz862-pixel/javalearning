package Demo;
// 怎样创建一个集合
public class ArrayList {
    // 集合里面有泛形的概念
    public static void main(String[] args) {
        java.util.ArrayList <String> s = new java.util.ArrayList<String>();
        // 集合对象默认不打印地址，打印对象，空对象就是一个[]括号
        // add方法
        s.add("aaa");
        s.add("bbb");
        s.add("ccc");
        s.add("ddd");
        s.add("eee");
        System.out.println(s);
        // remove api
        s.remove("aaa");
        System.out.println(s);
        // remove 也可以按照索引访问。
        s.remove(0);
        System.out.println(s);

        String changed = s.set(0,"cc"); //返回被修改的值
        System.out.println(changed);

        // 集合中的元素
        System.out.println(s.size());

        System.out.println(s);
    }
}
