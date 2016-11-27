package chapter3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by dev on 23/11/16.
 */
public class SortRabbits {
    static class Rabbit{int id;}

    public static void main(String [] args){
        List<Rabbit> rabbits = new ArrayList<>();
        rabbits.add(new Rabbit());
        Comparator<Rabbit> c = (a,b) -> a.id - b.id;
        Collections.sort(rabbits, c);
        rabbits.forEach(System.out::println);
    }
}
