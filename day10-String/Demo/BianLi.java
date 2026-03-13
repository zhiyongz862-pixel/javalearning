package Demo;
// 使用两个 api遍历字付串
// .length() 方法字付串长度
//charAt(int) 根据索引取出对应的值
public class BianLi {
    public static void main(String[] args) {

        String s1 = "abc";
        for (int i = 0; i < s1.length(); i++) {
            System.out.println(s1.charAt(i));
        }

    }
}
