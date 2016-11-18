package others;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dev on 22/10/16.
 */
public class TestingMyStuff {
    public static void main(String [] args){
        TestingMyStuff testingMyStuff = new TestingMyStuff();
        TestGenerics testGenerics = new TestGenerics();
        testingMyStuff.testDog(testGenerics);
        testingMyStuff.testCat(testGenerics);
    }

    public  void testDog(TestGenerics testGenerics){
        List<Dog> dogList = new ArrayList<>();
        testGenerics.add(dogList, new Dog("Hera"));
        testGenerics.add(dogList, new Dog("Kora"));
        testGenerics.add(dogList, new Dog("Willy"));

        testGenerics.printList(dogList);
    }

    public void testCat(TestGenerics testGenerics){
        List<Cat> catList = new ArrayList<>();
        testGenerics.add(catList, new Cat("Isidoro"));
        testGenerics.add(catList, new Cat("Casimiro"));
        testGenerics.add(catList, new Cat("Teddy"));

        testGenerics.printList(catList);
    }
}
