package Demo;
// 学习Substr方法
// 一个11位的手机号，屏蔽中间四位
public class Substring {
    public static void main(String[] args) {
        String s = "12345678901";
        // 返回值才是截止的
        String start = s.substring(0,4);
        //String end = s.substring(7,11);
        //上下一样的 单参数是从某个索引到最后
        String end = s.substring(7);
        System.out.println(start + "****"+ end);
    }
}
