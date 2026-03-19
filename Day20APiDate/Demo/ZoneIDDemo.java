package Demo;

import java.time.ZoneId;

public class ZoneIDDemo {
    public static void main(String[] args) {
        System.out.println(ZoneId.getAvailableZoneIds());
        // 默认时区
        System.out.println(ZoneId.systemDefault());
        System.out.println();

        //3.获取指定的时区
        ZoneId zoneId1 = ZoneId.of("Asia/Pontianak");
        System.out.println(zoneId1);//Asia/Pontianak
    }
}
