package others;

import java.util.*;
import java.util.function.*;

/**
 * Created by ngracia on 13/10/16.
 */
public class ImplementingFunctinalInterfacesTest {
    public static void main(String args []){
        ImplementingFunctinalInterfacesTest implementingFunctinalInterfacesTest = new ImplementingFunctinalInterfacesTest();
        implementingFunctinalInterfacesTest.testBiConsumer();
        implementingFunctinalInterfacesTest.testConsumer();
        implementingFunctinalInterfacesTest.testSupplier();
        implementingFunctinalInterfacesTest.testBiConsumer();
        implementingFunctinalInterfacesTest.testPredicate();
        implementingFunctinalInterfacesTest.testBiPredicate();
    }

    private void testSupplier(){
        Supplier<List<String>> supplier1 = ArrayList::new;
        Supplier<List<String>> supplier2 = () -> new ArrayList<>();
        List<String> list1 = supplier1.get();
        List<String> list2 = supplier2.get();

        Consumer<String>  consumer1 = list1::add;
        consumer1.accept("test1");
        consumer1.accept("test2");
        consumer1.accept("test3");
        list1.forEach(System.out::println);

        Consumer<String> print = System.out::print;
        print.accept("\n");

        Consumer<String>  consumer2 = x -> list2.add(x);
        consumer2.accept("test4");
        consumer2.accept("test5");
        consumer2.accept("test6");
        list2.forEach(System.out::println);

        print.accept("\n");


        //test Collection
        Supplier<HashMap<String, String>> map = () -> new HashMap<>();
        Supplier<List<String>> list = ArrayList::new;
        Supplier<Map<Integer, Integer>> mapInteger = HashMap::new;

    }

    private void testConsumer(){

        List<String> listString = Arrays.asList("Hola","Hello","Ciao");
        listString.stream();
        Consumer<String> consumerString = System.out::println;
        consumerString.accept(listString.get(1));
        consumerString.accept(listString.get(2));
        listString.forEach(x-> x.contains("o"));

        Consumer<String> print = System.out::print;
        print.accept("\n");

        List<Integer> listInteger = Arrays.asList(1,2,3);
        listInteger.stream();
        Consumer<Integer> consumerInteger = x -> System.out.println(x);
        consumerInteger.accept(listInteger.size());
        listInteger.forEach(x -> System.out.println(x == 1 ? 69 : 96));

        print.accept("\n");
    }

    private void testBiConsumer(){
        Supplier<HashMap<String, String>> map = () -> new HashMap<>();
        HashMap hashMap = map.get();
        BiConsumer<String, String> biConsumer = (x, y) -> hashMap.put(x,y);

        biConsumer.accept("1","hola");
        biConsumer.accept("2","hello");
        biConsumer.accept("3","ciao");

        hashMap.forEach((x,y) -> System.out.println("key: " + x + "\nValue: " + y ));
    }

    private void testPredicate(){
        //Filtering or matching
        Predicate<String> predicate = String::isEmpty;
        Consumer<Boolean> consumer = System.out::println;
        Consumer<String> consumer1 = System.out::println;
        consumer1.accept("\n");
        consumer.accept(predicate.test(""));

    }

    private void testBiPredicate(){
        //Filtering or matching
        String p = "hi";

        BiPredicate<String, String> biPredicate = (x , y) -> p.startsWith(x) && p.endsWith(y);
        Consumer<Boolean> consumer = System.out::println;
        consumer.accept(biPredicate.test("g","f"));
        consumer.accept(biPredicate.test("h","i"));
    }

    private void testFunction(){

    }

    private void testBiFunction(){

    }
}