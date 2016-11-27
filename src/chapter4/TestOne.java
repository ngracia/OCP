package chapter4;

import java.time.LocalTime;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Created by dev on 24/11/16.
 */
public class TestOne {
    public static void main(String args []){
        Consumer<LocalTime> consumer = System.out::println;
        Supplier<LocalTime> time = () ->  LocalTime.now();
        consumer.accept(time.get());
        testOne();
        testTwo();

    }

    public static void testOne(){
        Consumer<StringBuilder> consumer = System.out::println;
        Supplier<StringBuilder> sb = StringBuilder::new;
        StringBuilder sb1 = sb.get();
        sb1.append("hola");

        consumer.accept(sb1);
    }

    public static void testTwo(){
        Consumer<String> consumer = System.out::println;
        String bar = "This is just a test";
        consumer.accept(bar);
    }
}
