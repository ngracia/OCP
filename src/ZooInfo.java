import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by dev on 15/10/16.
 */
public class ZooInfo {
    public static void main(String [] args){
        ExecutorService service = null;
        try{
            service = Executors.newSingleThreadExecutor();
            service.execute(() -> System.out.println("Print zoo inventory"));
            service.execute(() -> {
                for(int i = 0; i<3; i++){
                    System.out.println("Print record: " + i);
                }
            });

            service.execute(() -> System.out.println("Printing zoo inventory"));
            System.out.println("end");


        }catch (Exception ex){

        }finally {
            if(service == null){
                service.shutdown();
            }
        }
    }
}
