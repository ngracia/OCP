package chapter3;

import jdk.nashorn.internal.ir.annotations.Ignore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by dev on 23/11/16.
 */
public class Duck implements Comparable<Duck> {

    private String name;
    private int weight;

    public Duck(String name, int weight){
        this.weight = weight;
        this.name = name;
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
        Comparator<Duck> byWeight = (d1, d2) -> d1.weight - d2.weight;
        Comparator<Duck> byName = (Duck d1, Duck d2) -> d2.name.compareTo(d1.name);

        List<Duck> ducks = new ArrayList<>();
        ducks.add(new Duck("Quack", 11));
        ducks.add(new Duck("Puddles", 22));

        Collections.sort(ducks);
        ducks.forEach(System.out::println);

        Collections.sort(ducks, byWeight);
        ducks.forEach(System.out::println);

        Collections.sort(ducks, byName);
        ducks.forEach(System.out::println);
    }
}
