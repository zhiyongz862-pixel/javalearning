package Demo;

public class StringJoiner {
    public static void main(String[] args) {
        // 单参构造函数，只有一个参数，间隔符号，也就是不断add的过程中间隔是啥
        java.util.StringJoiner s  = new java.util.StringJoiner(",");
        // 三个参数 间隔符号/这个字符串一开始是啥/这个字符串终止符号是啥
        java.util.StringJoiner s1 = new java.util.StringJoiner(",","[","]");
        // 就是一个[]
        s1.add("1").add("2");
        System.out.println(s1);
    }
}
