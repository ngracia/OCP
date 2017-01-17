package chapter4.review;

import java.util.stream.Stream;

/**
 * Created by dev on 17/01/17.
 */
public class TestReduce {
    public static void main(String args []){
        TestReduce testReduce = new TestReduce();
        testReduce.test();
    }

    private void test(){
        Stream<Integer> stream = Stream.of(1,2,3,4,5);
        int result = stream.reduce(1, (a, b)-> a * b);
        System.out.println(result);
    }
}
