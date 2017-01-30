package chapter7.Review;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by dev on 30/01/17.
 */
public class AddData {
    public static void main(String [] args) throws InterruptedException, ExecutionException {
        ExecutorService service = null;

        try{

            service = Executors.newSingleThreadExecutor();
            Future<Integer> result = service.submit(()-> 30+11);
            System.out.println(result.get());

        }finally {

            if (service != null){
                service.shutdown();

            }
        }
    }
}
