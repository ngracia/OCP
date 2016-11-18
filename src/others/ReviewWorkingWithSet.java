package others;

import java.util.*;
import java.util.function.Consumer;

/**
 * Created by dev on 23/10/16.
 */
public class ReviewWorkingWithSet {
    public static void main(String [] args){
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(1);
        set.add(3);
        set.add(4);

        ReviewWorkingWithSet reviewWorkingWithSet = new ReviewWorkingWithSet();
        reviewWorkingWithSet.print(set);

        Consumer<String> consumer = System.out::println;
        consumer.accept("");

        NavigableSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(0);
        treeSet.add(4);
        treeSet.add(3);
        treeSet.add(2);

        reviewWorkingWithSet.print(treeSet);
        consumer.accept("");
        System.out.println(treeSet.lower(3));
        consumer.accept("");
        System.out.println(treeSet.floor(3));
        consumer.accept("");
        System.out.println(treeSet.ceiling(3));
        consumer.accept("");
        System.out.println(treeSet.higher(3));

    }

    public void print(Set<? extends Number> set ){
        set.forEach(System.out::println);
    }
}
