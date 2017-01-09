package EnthuwareExams.test1;

import chapter2.review.Test;

/**
 * Created by Nestor Gracia on 1/6/2017.
 */
public class TestClass implements Runnable {

    volatile int x;
    public void run() { x = 5;}

    public static void main(String [] args){
        TestClass tc = new TestClass();
        tc.x = 10;
        new Thread(tc).start();
        System.out.println(tc.x);
    }
}
