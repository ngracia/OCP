import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by dev on 22/10/16.
 */
public class TestGenerics <T> {

    public void add(List<T> list, T t ){
        list.add(t);
    }

    public void printList(List<T> t){
        t.forEach(System.out::println);
    }
}
