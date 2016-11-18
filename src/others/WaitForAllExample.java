package others;

import jdk.nashorn.internal.ir.FunctionCall;

import java.util.concurrent.*;

/**
 * Created by dev on 16/10/16.
 */
public class WaitForAllExample {
    public static void main(String [] args) throws InterruptedException, ExecutionException{
        ExecutorService service = null;
        try{
            service = Executors.newSingleThreadExecutor();
            Future<Integer> result = service.submit(()-> 10+10);
        }finally {
            if(service != null){
                service.shutdown();
            }
        }

        if(service != null){
            service.awaitTermination(1, TimeUnit.MINUTES);
            if(service.isTerminated())
                System.out.println("All tasks finished");
            else
                System.out.println("At least on task is still running");
        }

    }
}
