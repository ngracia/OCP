package chapter7.Review;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by dev on 31/01/17.
 */
public class SheepManager2 {

    private int sheepCount = 0;
    private void incrementAndReport(){
        synchronized (this){
            System.out.print((++sheepCount) + " ");

        }
    }

    public static void main(String [] args){
          ExecutorService service = null;
        try{
            service = Executors.newFixedThreadPool(20);
            SheepManager2 manager = new SheepManager2();
            for (int i = 0; i<10; i++){
                service.submit(()-> manager.incrementAndReport());
            }
        }finally {
            if(service != null){
                service.shutdown();
            }
        }
    }
}
