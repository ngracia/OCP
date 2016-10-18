import java.util.StringJoiner;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by dev on 19/10/16.
 */
public class UsingBasicsCollectors {
    public static void main(String [] args){
        UsingBasicsCollectors usingBasicsCollectors = new UsingBasicsCollectors();
        usingBasicsCollectors.testJoining();
        usingBasicsCollectors.testAverageInt();
    }

    private void testJoining(){
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
        String result = ohMy.collect(Collectors.joining(", "));
        Consumer<String> consumer = System.out::println;
        consumer.accept(result);
    }

    private void testAverageInt(){
        Stream<String> s = Stream.of("lions", "tigers", "bears");
        Double result = s.collect(Collectors.averagingInt(String::length));
        Consumer<Double> consumer = System.out::println;
        consumer.accept(result);
    }

    private void testConvertToCollection(){
        /*Stream<Stream> s = Stream.of("lions","tigers","bears");
        String result*/
    }
}
