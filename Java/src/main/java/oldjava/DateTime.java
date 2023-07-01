package oldjava;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
        System.out.println(date1);

        System.out.println(date1.plusDays(3));
        System.out.println(date1.plusMonths(2));
        System.out.println(date1.minusYears(1));

        LocalTime time1 = LocalTime.now();
        System.out.println(time1);
        System.out.println(time1.plusMinutes(10));

        LocalTime time2 = LocalTime.now(ZoneId.of("Japan"));
        System.out.println(time2);

        DateTimeFormatter date2 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(date1.format(date2));
    }
}
