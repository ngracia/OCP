package chapter2;

import java.util.Arrays;
import java.util.function.Consumer;

/**
 * Created by dev on 21/11/16.
 */
public class TestFactoryBuilder {
    public static void main(String [] args){
        AnimalBuilder animalBuilder = new AnimalBuilder();
        animalBuilder
                .setSpecies("Duck")
                .setAge(22)
                .setFavoriteFood(Arrays.asList("grass", "fish"));

        Consumer<Animal> animalConsumer = System.out::println;
    }
}
