package chapter4;

import java.nio.file.FileSystemNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by dev on 18/11/16.
 */
public class PuttinTogetherThePipeLine {
    public static void main(String ... args){

        //Types of primitive Streams
        //IntStream: Used for the primitive types int, short, bytes and char.
        //LongStream: Used for the primitive type long.
        //DoubleStream: Used fot he primitive types double and float.

        Consumer<String> s = System.out::println;
        //testOne();
        //s.accept("");
        //testTwo();
        //s.accept("");
        //testThree();
        //s.accept("");
        //testFour();
        //testSix();
        //testSeven();
        testNine();
    }

    public static void testOne(){
        List<String> list = Arrays.asList("Toby","Anna","Leroy","Alex");
        list.stream()
                .filter(x -> x.length() == 4)
                .sorted()
                .limit(2)
                .forEach(System.out::println);
    }

    public static void testTwo(){
         Stream.generate(() -> "Elsa")
                 .limit(2)
                 .sorted()
                .forEach(System.out::println);
    }

    public static void testThree(){
        Stream.generate(() -> "Olaf Lazisson")
                .filter(x -> x.length() == 4)
                .limit(2)
                .forEach(System.out::println);
    }

    public static void testFour(){
        Stream<Integer>  s = Stream.iterate(1, x-> x + 1);

        s.limit(5)
                .filter(x -> x % 2 == 1)
                .forEach(System.out::println);
    }

    public static void testFive(){
        Stream.iterate(1, x -> x + 1)
                .peek(System.out::println)
                .limit(5)
                .filter(x -> x % 2 == 1)
                .forEach(System.out::println);
    }

    public static void testSix(){
         Stream.iterate(1, x -> x + 1)
                 .filter(x -> x % 2 == 1)
                 .limit(5)
                 .forEach(System.out::println);
    }

    public static void testSeven(){
        Consumer<Integer> consumer = System.out::println;
        Stream<Integer> s = Stream.of(1,2,3);
        consumer.accept(s.reduce(0, (x,y) -> x + y));
    }

    public static void testEight(){
        Consumer<Integer> consumer = System.out::println;
        Stream<Integer> s = Stream.of(1,2,3);
        consumer.accept(s.mapToInt(x -> x).sum());
    }

    public static void testNine(){
        Consumer<Double> consumer = System.out::println;
        IntStream intStream = IntStream.of(1,2,3);
        OptionalDouble avg = intStream.average();
        consumer.accept(avg.getAsDouble());
    }

    public static void testTen(){
        Stream<IntStream> s = Stream.of();
    }


}
