package Demo;
// 学习replace 方法 replace(旧值，新值) 只有返回值才是最后的结果，可以替换某个子串
public class Replace {
    public static void main(String[] args) {
        String s = "abcdefg";
        String ans = s.replace("abc","***");
        System.out.println(ans);
    }
}
