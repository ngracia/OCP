package chapter2.review;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Nestor Gracia on 1/7/2017.
 */
public class AnimalTest {
    public static void main(String [] args){
        AnimalBuilder animalBuilder = new AnimalBuilder();
        animalBuilder.setAge(3)
                .setSpecies("Feline")
                .setFavoriteFood(Arrays.asList("Meat", "milk"))
                .build();
    }
}
