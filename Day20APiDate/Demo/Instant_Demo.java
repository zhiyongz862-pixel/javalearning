package Demo;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Instant_Demo {
    public static void main(String[] args) {
        // 获取当前的时区对象
        Instant i = Instant.now();
        //
        System.out.println(i);

        // 通过ms值获取Instant对象
        Instant i1 = Instant.ofEpochMilli(0L);
        System.out.println(i1);

        // 得到当前时区对应的对象
        ZonedDateTime time = Instant.now().atZone(ZoneId.systemDefault());
        System.out.println(time);

        //4.isXxx 判断
        Instant instant4=Instant.ofEpochMilli(0L);
        Instant instant5 =Instant.ofEpochMilli(1000L);

        //5.用于时间的判断
        //isBefore:判断调用者代表的时间是否在参数表示时间的前面
        boolean result1=instant4.isBefore(instant5);
        System.out.println(result1);//true

        //isAfter:判断调用者代表的时间是否在参数表示时间的后面
        boolean result2 = instant4.isAfter(instant5);
        System.out.println(result2);//false

        //6.Instant minusXxx(long millisToSubtract) 减少时间系列的方法 返回值还是Instant
        Instant instant6 =Instant.ofEpochMilli(3000L);
        System.out.println(instant6);//1970-01-01T00:00:03Z

        Instant instant7 =instant6.minusSeconds(1);
        System.out.println(instant7);//1970-01-01T00:00:02Z
    }
}
