package others;

import others.AnotherAnimal;

/**
 * Created by dev on 22/10/16.
 */
public class Cat extends AnotherAnimal {
    private String name;

    public Cat(String name){

        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }
}
