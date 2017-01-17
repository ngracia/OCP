package chapter2.review;

/**
 * Created by ngracia on 06/01/2017.
 */
public class FindMatchingAnimals {
    private static void print(Animal animal, CheckTrait trait){
        if(trait.test(animal)){
            System.out.println(animal);
        }
    }

   /* public static void main(String [] args){
        print(new Animal("fish", false, true), x -> x.canHop());
        print(new Animal("Kangaroo", true, false), x -> x.canHop());

        printTest(new Test("jose"), x -> x.getName());
    }*/

    private static void printTest(Test test, AnotherTest anotherTest){
        System.out.println(anotherTest.testTest(test));
    }
}
