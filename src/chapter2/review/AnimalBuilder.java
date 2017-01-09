package chapter2.review;

import java.util.List;

/**
 * Created by Nestor Gracia on 1/7/2017.
 */
public final class AnimalBuilder {
    private String species;
    private int age;
    private List<String> favoriteFood;

    public AnimalBuilder setAge(int age){
        this.age = age;
        return this;
    }

    public AnimalBuilder setSpecies(String species){
        this.species = species;
        return this;
    }

    public AnimalBuilder setFavoriteFood(List<String> favoriteFood){
        this.favoriteFood = favoriteFood;
        return this;
    }

    public Animal build(){
        return new Animal(species, age, favoriteFood);
    }

}
