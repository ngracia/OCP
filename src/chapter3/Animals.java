package chapter3;

import chapter2.Animal;
import others.ScheduledExecutorServiceMethodsTest;

import java.util.*;

/**
 * Created by dev on 23/11/16.
 */
public class Animals implements Comparable<Animals> {

    private int age;
    private String species;

    public Animals(int age, String species){
        this.species = species;
        this.age = age;
    }
    public Animals(int age){

    }

    @Override
    public String toString(){
        return "The name of the specie is " + species + "and the age is " + age;
    }

    @Override
    public int compareTo(Animals animals){
        return animals.age - age;
    }

    public static void main(String args []){
        List<Animals> animalsList = new ArrayList<>();
        animalsList.add(new Animals(13, "Lion"));
        animalsList.add(new Animals(7, "Zebra"));
        animalsList.add(new Animals(25, "giraff"));
        Collections.sort(animalsList);
        animalsList.forEach(System.out::println);
    }
}
