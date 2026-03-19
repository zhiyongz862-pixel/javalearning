package Demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

// format就是把一个date对象按照想要的格式变成字符串 时间按照想要的方式展现
// parse就是把一个已知格式的时间字符串变成date对象
public class DemoSimpleDateFormat {
    public static void main(String[] args) throws ParseException {
        // 定一个一个SimpleDateFormat，这个是默认格式
        SimpleDateFormat sdf = new SimpleDateFormat();
        Date d = new Date(0L);
        // 方便打印
        String format = sdf.format(d);
        System.out.println(format);

        // 这个构造函数是用于定义格式的
        // 1-3个E显示周几 4个E显示星期几
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EE");
        // 这里按照定义的格式 和Date对象构造出字符串
        String str = sdf1.format(d);
        System.out.println(str);

        // 定义一个字符串表示时间 这个也是SimpleDateFormat主要的用法，按照字符串定义时间
        String str1 = "2023-11-11 11:11:11";
        // 上面的格式必须和下面的格式完全一样
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = sdf2.parse(str1);
        System.out.println(parse);

    }
}
