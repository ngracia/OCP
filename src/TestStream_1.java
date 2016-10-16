import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by dev on 16/10/16.
 */
public class TestStream_1 {
    public static void main(String args []){
        List<String> list  = Arrays.asList("Toby", "Anna", "Leroy", "Alex");
        Stream<String> stream = list.stream();

        stream.filter(n -> n.length() >= 4)
                .sorted()
                .limit(4)
                .forEach(System.out::println);
    }
}
