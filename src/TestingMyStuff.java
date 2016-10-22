import java.util.ArrayList;
import java.util.List;

/**
 * Created by dev on 22/10/16.
 */
public class TestingMyStuff {
    public static void main(String [] args){
        TestingMyStuff testingMyStuff = new TestingMyStuff();
        testingMyStuff.testDog();
        testingMyStuff.testCat();
    }

    public  void testDog(){
        TestGenerics<Dog> testGenerics = new TestGenerics<>();
        List<Dog> dogList = new ArrayList<>();
        testGenerics.add(dogList, new Dog("Hera"));
        testGenerics.add(dogList, new Dog("Kora"));
        testGenerics.add(dogList, new Dog("Willy"));

        testGenerics.printList(dogList);
    }

    public void testCat(){
        TestGenerics<Cat> testGenerics = new TestGenerics<>();
        List<Cat> catList = new ArrayList<>();
        testGenerics.add(catList, new Cat("Isidoro"));
        testGenerics.add(catList, new Cat("Casimiro"));
        testGenerics.add(catList, new Cat("Teddy"));

        testGenerics.printList(catList);
    }
}
