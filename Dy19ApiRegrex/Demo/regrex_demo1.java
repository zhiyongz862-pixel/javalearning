package Demo;

public class regrex_demo1 {
    public static void main(String[] args) {
        //    13112345678
        // 电话号码的正则
        String regrex1 = "1[3-9]\\d{9}";
        String regrex2 = "0\\d{2,3}-?[1-9]\\d{4,9}";
    }
}
