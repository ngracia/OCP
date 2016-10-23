import java.util.*;
/**
 * Created by dev on 22/10/16.
 */
public class UnboundWildcards {
    public static void main(String args[] ){
        List<String> list = new ArrayList<>();
        list.add("Java");

        printList(list);
    }

    public static void printList(List<?> list){
        list.forEach(System.out::println);
    }
}
