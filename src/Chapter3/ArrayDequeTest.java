package Chapter3;

import java.util.ArrayDeque;

/**
 * Created by dev on 14/11/16.
 */
public class ArrayDequeTest {
    public static void main(String [] args){
        ArrayDeque<String> greetings = new ArrayDeque<String>();
        greetings.push("hello");
        greetings.push("hi");
        greetings.push("ola");
        greetings.pop();
        greetings.peek();
        while(greetings.peek() != null){
            System.out.println(greetings.pop());
        }
    }
}
