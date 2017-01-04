package chapter7;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by dev on 22/12/16.
 */
public class ZooInfo {
    public static void main(String [] args){
        ExecutorService service = null;
        try{
            service = Executors.newSingleThreadExecutor();
            System.out.println("begin");
            service.execute(() -> System.out.println("Printing zoo inventory"));
            service.execute(() -> {for(int i = 0; i < 3; i++)
                System.out.println("Print record: " + i);
            });

            service.execute(() -> System.out.println("Printing zoo inventory"));
            System.out.println("end");
        }finally {
            if(service != null) service.shutdown();
        }
    }
}
