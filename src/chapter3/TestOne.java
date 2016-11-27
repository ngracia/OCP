package chapter3;

import java.util.*;
import java.util.function.*;

/**
 * Created by dev on 23/11/16.
 */
public class TestOne {
    public static void main(String args []){

        //testMap();
        testFunction();
    }

    public static void testOne(){
        List<String> list = Arrays.asList("hola", "hello", "ciao");
        Comparator<String> comparator = Comparator.reverseOrder();
        Collections.sort(list, comparator);
        list.forEach(System.out::println);

        Consumer<Integer> consumer = System.out::println;
        consumer.accept(Collections.binarySearch(list, "test", comparator));
    }

    public static void testMap(){
        Supplier<Map<String, String>> supplier = HashMap::new;
        Map map = supplier.get();
        BiConsumer<String, String> b1 = map::put;

        b1.accept("1","Nestor");
        b1.accept("2","Magnifico");
        b1.accept("3","Profesional");
        b1.accept("3","Increible");

        map.forEach((x,y) -> System.out.println("Key: " + x + " Value: " + y));
    }

    public static void testFunction(){

        Consumer<Integer> consumer = System.out::println;
        Function<String, Integer> f1 = String::length;
        Function<String, Integer> f2 = x -> x.length();

        consumer.accept(f1.apply("Test"));
        consumer.accept(f1.apply("This is another fucking test."));

     }

     public static void testAnimals(){
        Animals animals = new Animals(13);
     }

     public static void testBiFunction(){
         Consumer<String> c = System.out::println;
         BiFunction<String, String, String> b1 = (x, y) -> x.concat(y);
         c.accept(b1.apply("hola", "calaracola"));
     }
}
