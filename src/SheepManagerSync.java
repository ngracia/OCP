import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by dev on 18/10/16.
 */
public class SheepManagerSync{
    private int sheepCount = 0;

    private void incrementAndReport(){
        synchronized (this){
            System.out.println((++sheepCount)+" ");
        }
    }

    public static void main(String [] args){
        ExecutorService service = null;
        try{
            service = Executors.newFixedThreadPool(20);
            SheepManagerSync manager = new SheepManagerSync();
            for(int i=0; i<10; i++){
                service.submit(()-> manager.incrementAndReport());
            }
        }finally {

            if(service != null){
                service.shutdown();
            }
        }
    }
}
