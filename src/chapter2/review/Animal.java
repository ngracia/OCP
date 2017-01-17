package chapter2.review;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ngracia on 06/01/2017.
 */
public final class Animal {

    private final String species;
    private final int age;
    private final List<String> favoriteFoods;

    public Animal(String species, int age, List<String> favoriteFoods){
        this.species = species;
        this.age = age;
        if(favoriteFoods == null){
            throw new RuntimeException("favoriteFoods is required");
        }
        this.favoriteFoods = new ArrayList<String>(favoriteFoods);
    }

    public String getFavoriteFoods(int index){
        return favoriteFoods.get(index);
    }

    public int getFavoriteFoodsCount(){
        return favoriteFoods.size();
    }

    public String getSpecies(){
        return species;
    }

    public int getAge(){
        return age;
    }
}
