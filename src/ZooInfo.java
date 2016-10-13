import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;

/**
 * Created by dev on 13/10/16.
 */
public class ZooInfo {
    public static void main(String [] args){
        ExecutorService service = null;
        try{
            service = Executors.newSingleThreadExecutor();
            Consumer<String> print = System.out::println;

            print.accept("begin");
            service.execute(() -> print.accept("Printing zoo inventory"));
            service.execute( () -> { for (int i = 0; i < 3; i++){
                print.accept("Println record: " +i);
            }});
            service.execute(()->print.accept("Printing zoo inventory"));
            print.accept("end");

        }finally {
            if(service != null){
                service.shutdown();
            }
        }
    }
}
