package chapter3.review;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by dev on 06/02/17.
 */
public class TestQueue {
    public static void main(String [] args){
        Queue<Integer> queue = new ArrayDeque<>();
        System.out.println(queue.offer(10));
        System.out.println(queue.offer(4));
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
    }
}
