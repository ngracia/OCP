package chapter3.review;

import java.util.NavigableSet;
import java.util.TreeSet;

/**
 * Created by dev on 06/02/17.
 */
public class TestNavigableSet {
    public static void main(String [] args){
        NavigableSet<Integer> set = new TreeSet<>();
        for(int i = 1; i <= 20; i++){
            set.add(i);
        }
        System.out.println(set.lower(10));
    }
}
