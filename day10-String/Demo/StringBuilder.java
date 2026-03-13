package Demo;
// 学习StringBuilder （可变String）
// 为什么要学 ，之前的String拼接1000000次，很慢，因为每次都要重新创建对象，这个太慢了
// 使用 字符串拼接和反转 其他不用
public class StringBuilder {
    public static void main(String[] args) {
        java.lang.StringBuilder s = new java.lang.StringBuilder("abc");
        // 这个不仅会改变，还会返回改变后的容器
        s.append("efg");
        //链式编程
        s.append("edc").append("sss");
        // 可以直接打印，因为StringBuilder重写了toString方法
        // 容量api
        System.out.println(s.capacity());

        System.out.println(s);
        System.out.println(s.length());
        // 反转，直接发生变化，不用返回
        System.out.println(s.reverse());

        // 转回字符串可以使用字符串的对象
        String str = s.toString();


    }
}
