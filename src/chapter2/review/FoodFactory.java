package chapter2.review;

/**
 * Created by Nestor Gracia on 1/7/2017.
 */
public class FoodFactory {
    public static Food getFood(String animalName){
        switch(animalName){
            case "zebra":
                return new Hay(100);
            case "rabbit":
                return new Pellets(5);
            case "goat":
                return new Pellets(30);
            case "Polar Bear":
                return new Fish(10);
        }
        throw new UnsupportedOperationException("Unsupported animal: " + animalName);
    }
}
