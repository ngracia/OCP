package others;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by dev on 23/10/16.
 */
public class Duck implements Comparable<Duck> {
    private String name;
    private int weight;

    public Duck(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    public String getName(){
        return name;
    }

    public int getWeight(){
        return weight;
    }

    @Override
    public String toString(){
        return name;
    }

    @Override
    public int compareTo(Duck d){
        return name.compareTo(d.name);
    }

    public static void main(String args[]){
        List<Duck> list = new ArrayList<>();
        list.add(new Duck("Quack", 7));
        list.add(new Duck("Puddles", 10));
        Collections.sort(list);

        list.forEach(System.out::println);


    }
}
