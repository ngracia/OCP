package chapter2.review;

/**
 * Created by Nestor Gracia on 1/7/2017.
 */
public class Fish extends Food {

    public Fish(int quantity){
        super(quantity);
    }

    @Override
    public void consumed() {
        System.out.println("Fish eaten:" +getQuantity());
    }
}
