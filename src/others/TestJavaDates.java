package others;

import java.time.*;
import java.util.function.Consumer;

/**
 * Created by dev on 19/10/16.
 */
public class TestJavaDates {
    public static void main(String [] args){
        LocalDate localDate = LocalDate.of(2016, Month.DECEMBER,11);
        Consumer<LocalDate> consumer = System.out::println;
        consumer.accept(localDate);


        LocalTime localTime = LocalTime.now();
        Consumer<LocalDateTime> consumer1 = System.out::println;
        consumer1.accept(LocalDateTime.of(localDate, localTime));

        ZoneId zone = ZoneId.of("US/Eastern");

        ZonedDateTime zone1 = ZonedDateTime.of(2015, 1, 20, 6, 15, 30, 20, zone);
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDate, localTime , zone);


        //Finding a time zone\
        ZoneId.getAvailableZoneIds().stream()
                .filter(x -> x.contains("") || x.contains("United Kingdom"))
                .sorted().forEach(System.out::println);

        LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
        System.out.println(date);
        date = date.plusDays(2);
        System.out.println(date);
        date = date.plusYears(2);
        System.out.println(date);
    }
}
