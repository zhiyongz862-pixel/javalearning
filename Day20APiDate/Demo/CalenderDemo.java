package Demo;

import javax.xml.crypto.Data;
import java.util.Calendar;
import java.util.Date;

// Calender 是一个抽象类，可以单独修改、获取年月日
//日历中的月份是0-11
//星期：星期日是一周中的第一天
// 1年 2月 3日
public class CalenderDemo {
    public static void main(String[] args) {
        // 不同时区获得不同日历对象
        Calendar cal = Calendar.getInstance();
        // 日历对象信息会放到一个数组里
        System.out.println(cal);

        // 第一种方式，按照Date对象进行设置
        Date d = new Date(0L);
        cal.setTime(d);
        System.out.println(cal);

        // YEAR是常量1 代表可以获得那个是几几年

        // 年字段修改成2000年
        cal.set(Calendar.YEAR,2000);
    }
}
