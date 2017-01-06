package chapter2.review;

/**
 * Created by ngracia on 06/01/2017.
 */
public class Oceanographer {
    public void checkSound(LivesInOcean animal){
        animal.makeSound();
    }

    public static void main(String args []){
        Oceanographer o = new Oceanographer();
        o.checkSound(new Dolphin());
        o.checkSound(new Whale());
    }
}
