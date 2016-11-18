package others;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by dev on 19/10/16.
 */
public class UsingBasicsCollectors {
    public static void main(String[] args) {
        UsingBasicsCollectors usingBasicsCollectors = new UsingBasicsCollectors();
        usingBasicsCollectors.testJoining();
        usingBasicsCollectors.testAverageInt();
        //usingBasicsCollectors.max(Stream);
        usingBasicsCollectors.threeDigit(Optional.empty());
    }

    private void testJoining() {
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
        String result = ohMy.collect(Collectors.joining(", "));
        Consumer<String> consumer = System.out::println;
        consumer.accept(result);
    }

    private void testAverageInt() {
        Stream<String> s = Stream.of("lions", "tigers", "bears");
        Double result = s.collect(Collectors.averagingInt(String::length));
        Consumer<Double> consumer = System.out::println;
        consumer.accept(result);
    }

    private void testConvertToCollection() {
        /*Stream<Stream> s = Stream.of("lions","tigers","bears");
        String result*/
    }

    //I know this is not related with collectors at all.
    private int max(IntStream ints){
        OptionalInt optional = ints.max();
        optional.orElseThrow(RuntimeException::new);
        return 0;
    }

    public static void threeDigit(Optional<Integer> optional){
        optional.map(n -> "" + n)
                .filter(s -> s.length() == 3)
                .ifPresent(System.out::println);
    }
}
