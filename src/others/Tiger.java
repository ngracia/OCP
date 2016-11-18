package others;

import others.Animal;
import others.Spring;

public class Tiger implements Spring {
    @Override
    public void sprint(Animal animal){
        System.out.println("Animal is sprinting fast! " + animal.toString());
    }
}

