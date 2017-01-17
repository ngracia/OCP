package chapter3.review;

import chapter8.ConcoleSample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by dev on 08/01/17.
 */
public class Duck implements Comparable<Duck>{
    private String name;
    public Duck(String name){
        this.name = name;
    }

    public String toString(){
        return name;
    }

    public int compareTo(Duck d){
        return name.compareTo(d.name);
    }

    public static void main(String [] args){
        List<Duck> ducks = new ArrayList<>();
        ducks.add(new Duck("Quack"));
        ducks.add(new Duck("Puddles"));
        Collections.sort(ducks);
        System.out.print(ducks);
    }
}
