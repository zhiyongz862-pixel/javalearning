package Demo;

// 也不能说对象，因为他没有new
public class StringAPI {
    public static void main(String[] args) {
        String name = "ab";
        // 这个其实创建了一个新的对象，因为字符串的值不可更改
        name = "bc";
        String ans = new String("abc");
        System.out.println(ans);
    }
}
