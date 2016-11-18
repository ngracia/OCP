package others;

import java.util.concurrent.*;

/**
 * Created by dev on 15/10/16.
 */
public class CheckResult {
    public static int counter = 0;
    public static void main(String [] args) throws InterruptedException, ExecutionException{
        ExecutorService service = null;
        try{
            service = Executors.newSingleThreadExecutor();
            Future<?> result = service.submit(() -> {
                for (int i = 0; i<500 ; i++){
                    CheckResult.counter++;
                }
            });

            result.get(10, TimeUnit.SECONDS);
            System.out.println("Reached!");
        }catch (TimeoutException e){
            System.out.println("Not reached in time.");
        }finally {
            if(service != null) service.shutdown();
        }
    }
}
