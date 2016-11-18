package others;

/**
 * Created by dev on 22/10/16.
 */
public class AnotherAnimal {
    private String name;

    AnotherAnimal(){
    }

    AnotherAnimal(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }
}
