package chapter2.review;

import chapter2.review.Food;

/**
 * Created by Nestor Gracia on 1/7/2017.
 */
public class Pellets extends Food {

    public Pellets(int quantity){
        super(quantity);
    }

    @Override
    public void consumed() {
        System.out.println("Pellets eaten: " + getQuantity());
    }
}
