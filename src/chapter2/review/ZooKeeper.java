package chapter2.review;

/**
 * Created by Nestor Gracia on 1/7/2017.
 */
public class ZooKeeper {
    public static void main(String args []){
        final Food food = FoodFactory.getFood("Polar Bear");
        food.consumed();
    }
}
