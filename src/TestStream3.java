import java.util.stream.Stream;

/**
 * Created by dev on 16/10/16.
 */
public class TestStream3 {
    public static void main(String [] args){
        Stream.generate(() -> "Olaf Lazisson")
                .filter(n -> n.length() == 4)
                .limit(2)
                .sorted()
                .forEach(System.out::println);
    }
}
