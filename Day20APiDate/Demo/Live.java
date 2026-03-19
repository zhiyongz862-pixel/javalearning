package Demo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Live {
    public static void main(String[] args) {
        LocalDateTime birth = LocalDateTime.of(2003,8,3,0,0,0);
        LocalDateTime  now = LocalDateTime.now();
        System.out.println(ChronoUnit.DAYS.between(birth,now));
    }
}
