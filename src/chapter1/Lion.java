package chapter1;

/**
 * Created by dev on 03/01/17.
 */
public class Lion extends Animal {

    @Override
    public void feed() {
        addMeat();
    }

    private void addMeat(){
        System.out.println("Bird eats meat");
    }
}
