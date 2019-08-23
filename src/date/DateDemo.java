package date;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author machao
 * @date 2019/8/21
 * @time 9:32
 * @description
 **/
public class DateDemo {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(1992,12,30);
        System.out.println(localDate);
        LocalDate now = LocalDate.now();
        System.out.println(now);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

    }
}
