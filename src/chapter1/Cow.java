package chapter1;

/**
 * Created by dev on 03/01/17.
 */
public class Cow extends Animal{
    @Override
    public void feed() {
        addHay();
    }

    private void addHay(){
        System.out.println("Bird eats hay");
    }
}
