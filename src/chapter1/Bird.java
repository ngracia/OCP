package chapter1;

import java.util.AbstractCollection;

/**
 * Created by dev on 03/01/17.
 */
public class Bird extends Animal{
    @Override
    public void feed() {
        addSeed();
    }

    private void addSeed(){
        System.out.println("Bird eats seed");
    }
}
