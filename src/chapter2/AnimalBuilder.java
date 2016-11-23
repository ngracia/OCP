package chapter2;

import java.util.List;

/**
 * Created by dev on 21/11/16.
 */
public class AnimalBuilder {
    private String species;
    private int age;
    private List<String> favoriteFoods;

    public AnimalBuilder setAge(int age){
        this.age = age;
        return this;
    }

    public AnimalBuilder setSpecies(String species){
        this.species = species;
        return this;
    }

    public AnimalBuilder setFavoriteFood(List<String> favoriteFoods){
        this.favoriteFoods = favoriteFoods;
        return this;
    }

    public Animal build(){
        return new Animal(species, age, favoriteFoods);
    }
}
