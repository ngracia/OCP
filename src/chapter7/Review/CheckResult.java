package chapter7.Review;

import java.util.function.Consumer;

/**
 * Created by dev on 24/01/17.
 */
public class CheckResult {
    private static int counter = 0;

    public static void main(String [] args) throws InterruptedException{

        Consumer<String> consumer = x -> System.out.println(x);

        new Thread(() -> {
            for(int i = 0; i < 500; i++){
                CheckResult.counter++;
            }
        }).start();

        while(CheckResult.counter< 100){
            System.out.println("No reached yet");
            Thread.sleep(1000); //1 SECOND
        }

        consumer.accept("Reached");
    }
}
