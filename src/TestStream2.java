import java.util.stream.Stream;

/**
 * Created by dev on 16/10/16.
 */
public class TestStream2 {
    public static void main(String args[]){
        Stream.generate(() -> "Elsa")
                .limit(2)
                .sorted()
                .forEach(System.out::println);
    }
}
