package chapter2;

/**
 * Created by dev on 06/01/17.
 */
public class Tiger implements Sprint {

    @Override
    public void sprint(Animal animal){
        System.out.println("Animal is sprinting fast!" + animal.toString());
    }
}
