package chapter4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * Created by dev on 17/11/16.
 */
public class IntermediateOperations {
    public static void main(String args[]){
        Consumer<String> consumer = System.out::println;
        intermediateOperationsFilter();
        consumer.accept("");
        intermediateOperationsDistinct();
        consumer.accept("");
        intermediateOperationsLimit();
        consumer.accept("");
        intermediateOperationsSkip();
        consumer.accept("");
        intermediateOperationsMap();
        consumer.accept("");
        intermediateOperationsFlatMap();
        consumer.accept("");
        intermediateOperationsSorted();
        consumer.accept("");
        intermediateOperationsPeek();
    }

    public static void intermediateOperationsFilter(){
        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        s.filter(x -> x.startsWith("m")).forEach(System.out::println);
    }

    public static void intermediateOperationsDistinct(){
        Stream<String> s = Stream.of("monkey","gorilla", "bonobo","monkey");
        s.distinct().forEach(System.out::println);
    }

    public static void intermediateOperationsLimit(){
        Stream<Integer> s = Stream.iterate(1, n -> n + 1);
        s.skip(2).limit(5).forEach(System.out::println);
    }

    public static void intermediateOperationsSkip(){
        Stream<Integer> s = Stream.iterate(1, n -> n + 1);
        s.skip(5).limit(7).forEach(System.out::print);
    }

    public static void intermediateOperationsMap(){
        Stream<String> s = Stream.of("monkey","gorilla", "bonobo");
        s.map(x -> x.length()).forEach(System.out::println);
    }

    public static void intermediateOperationsFlatMap(){
        List<String> zero = Arrays.asList();
        List<String> one = Arrays.asList("Bonobo");
        List<String> two = Arrays.asList("Mom Gorilla", "Baby Gorilla");
        List<String> three = Arrays.asList("Mom Chimpanzee", "Daddy Chimpanzee", "Baby Chimpanzee");
        Stream<List<String>> animals = Stream.of(zero, one, two, three);
        animals.flatMap(l -> l.stream()).forEach(System.out::println);
    }

    public static void intermediateOperationsSorted(){
        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        s.sorted().forEach(System.out::println);
    }

    public static void intermediateOperationsPeek(){
        Consumer<Long> consumer = System.out::println;
        Stream<String> s = Stream.of("black bear", "brown bear", "grizzly");
        long count = s.filter(x -> x.startsWith("g")).peek(System.out::println).count();
        consumer.accept(count);
    }
}
