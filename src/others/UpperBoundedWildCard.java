package others;

import java.util.*;
/**
 * Created by dev on 22/10/16.
 */
public class UpperBoundedWildCard {

    public static void main(String[] args) {
        List<AnotherAnimal> anotherAnimal = new ArrayList<>();
        anotherAnimal.add(new AnotherAnimal("Test1"));
        anotherAnimal.add(new AnotherAnimal("Test2"));
        anotherAnimal.add(new AnotherAnimal("Test3"));

        UpperBoundedWildCard upperBoundedWildCard = new UpperBoundedWildCard();
        upperBoundedWildCard.test(anotherAnimal);

    }

    public void test(List<? super Cat> list) {
        list.forEach(x -> System.out.println(x));
    }
}