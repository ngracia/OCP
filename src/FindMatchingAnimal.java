/**
 * Created by dev on 15/10/16.
 */
public class FindMatchingAnimal {
    private static void print(Animal animal, CheckTrait<Animal> trait){
        if(trait.test(animal)){
            System.out.println(animal);
        }
    }

    public static void main(String [] args){
        print(new Animal("fish", false, true),  a -> a.canSwim() );
    }
}
