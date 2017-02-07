package chapter3.review;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by dev on 06/02/17.
 */
public class TestSet {

    public static void main(String [] args){
        Set<Integer> set = new HashSet<>();
        boolean b1 = set.add(66);
        boolean b2 = set.add(10);
        boolean b3 = set.add(66);
        boolean b4 = set.add(8);

        //set.forEach(x -> System.out.print(x + ","));

        Set<Integer> treeSet = new TreeSet<>();

        boolean b5 = treeSet.add(66);
        boolean b6 = treeSet.add(10);
        boolean b7 = treeSet.add(66);
        boolean b8 = treeSet.add(8);

        treeSet.forEach(x -> System.out.print(x + ","));
    }
}
