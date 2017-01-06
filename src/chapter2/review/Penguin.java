package chapter2.review;

/**
 * Created by ngracia on 06/01/2017.
 */
public class Penguin {
    private final WebbedFeet webbedFeet;
    private final Flippers flippers;

    public Penguin(){
        this.flippers = new Flippers();
        this.webbedFeet = new WebbedFeet();
    }

    public void flap(){
        flippers.flap();
    }

    public void kick(){
        webbedFeet.kick();
    }

}
