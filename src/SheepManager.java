import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by dev on 18/10/16.
 */
public class SheepManager {
    private int sheepCount = 0;
    private void incremenAndReport(){
        System.out.println((++sheepCount) + " ");
    }

    public static void main(String args []){
        ExecutorService service = null;
        try{
            service = Executors.newFixedThreadPool(20);

            SheepManager manager = new SheepManager();
            for(int i = 0; i<10; i++)
                service.submit(() -> manager.incremenAndReport());
        }finally {
            if(service != null){
                service.shutdown();
            }
        }
    }

}
