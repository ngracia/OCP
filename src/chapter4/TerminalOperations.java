package chapter4;

import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * Created by dev on 17/11/16.
 */
public class TerminalOperations {
    public static void main(String... args){
        Consumer<String> consumer = System.out::println;
        terminalOperationFindAnyFindFirst();
        consumer.accept("");
    }

    private static void terminalOperationFindAnyFindFirst(){
        Stream<String> s = Stream.of("monkey","gorilla","bonobo");
        Stream<String> infinite = Stream.generate(() -> "chimp");

        s.findAny().ifPresent(System.out::println);
        infinite.findAny().ifPresent(System.out::println);
    }
}
