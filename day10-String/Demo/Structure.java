package Demo;

public class Structure {
    public static void main(String[] args) {
        // 直接赋值构造 直接赋值在串值里面，字符串内存可以共享
        String s1 = "abc";
        //复用s1，内存可以共享，只有赋值的才在串池里
        String s5 = "abc";

        //空参构造
        String s2 = new String();

        char [] chs = {'a','b','c'};
        // 通过字符数组构造
        String s3 = new String (chs);

        byte []  b = {97,98,99};
        //通过字节数组构造
        String s4 = new String(b);
        System.out.println(s4);
    }
}
