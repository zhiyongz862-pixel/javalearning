package Demo;


import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Date d1  = new Date(); // 获取当前时间
        System.out.println(d1);
        // 和标准时间差多少ms
        Date d2 = new Date(1000);
        System.out.println(d2);

        // 使用settime方法 将方法定义到当前
        long time = System.currentTimeMillis();
        d2.setTime(time);

        System.out.println(d2);

        System.out.println(d2.getTime());
    }
}
