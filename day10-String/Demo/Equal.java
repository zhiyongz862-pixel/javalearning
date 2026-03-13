package Demo;

public class Equal {
    public static void main(String[] args) {
        char[] chs = {'a', 'b', 'c'};
        String s1 = new String(chs);
        String s2 = new String(chs);

        //直接赋值的方式得到对象
        String s3 = "abc";
        String s4 = "abc";

        //比较字符串对象地址是否相同
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        // 只有这个是相等的 因为共享字符串地址
        System.out.println(s3 == s4);
        System.out.println("--------");

        //比较字符串内容是否相同 下面全是True
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s4));

        String s5 = "ABC";
        // 忽略大小写的比较
        System.out.println(s1.equalsIgnoreCase(s5));
    }
}
