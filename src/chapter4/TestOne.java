package chapter4;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * Created by dev on 24/11/16.
 */
public class TestOne {
    public static void main(String args []){
        testReduce();
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

    public static void testReduce() {
        Consumer<Integer> consumer = System.out::println;
        List<Integer> list = Arrays.asList(1, 2, 3);
        Stream<Integer> stream = list.stream();
        consumer.accept(stream.reduce(0, (x, y) -> x + y));
    }
}
