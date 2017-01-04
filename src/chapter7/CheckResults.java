package chapter7;

import others.CheckResult;

import java.util.concurrent.*;

/**
 * Created by dev on 23/12/16.
 */
public class CheckResults {
    private static int counter = 0;

    public static void main (String args []) throws InterruptedException, ExecutionException{
        ExecutorService service = null;

        try{
            service = Executors.newSingleThreadExecutor();
            Future<?> result= service.submit(() -> { for (int i = 0; i < 500; i++)
                CheckResult.counter++;
            });

            result.get(10, TimeUnit.SECONDS);
            System.out.println("Reached!");

        } catch (TimeoutException e) {
            System.out.println("Reached in time");
        } finally {
            if(service != null) service.shutdown();
        }

    }
}
