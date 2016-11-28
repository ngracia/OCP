package chapter5;

import javafx.scene.input.ZoomEvent;

import java.time.*;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Created by dev on 28/11/16.
 */
public class TestOne {
    public static void main(String ... args){
        testDateWithNoTime();
    }

    public static void testLocalDate(){
        Consumer<LocalDate> consumer = System.out::println;
        Supplier<LocalDate> supplier = LocalDate::now;
        consumer.accept(supplier.get());
    }

    public static void testLocalTime(){
        Consumer<LocalTime> consumer = System.out::println;
        Supplier<LocalTime> supplier = LocalTime::now;
        consumer.accept(supplier.get());
    }

    public static void testLocalDateTime(){
        Consumer<LocalDateTime> consumer = System.out::println;
        Supplier<LocalDateTime> supplier = LocalDateTime::now;
        consumer.accept(supplier.get());
    }

    public static void testZonedDateTime(){
        Consumer<ZonedDateTime> consumer = System.out::println;
        Supplier<ZonedDateTime> supplier = ZonedDateTime::now;
        consumer.accept(supplier.get());
    }

    public static void testDateWithNoTime(){
        Consumer<LocalDate> consumer = System.out::println;
        LocalDate localDate = LocalDate.of(2016, Month.NOVEMBER, 28);
        consumer.accept(localDate);
    }
}
