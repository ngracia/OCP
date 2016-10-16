import java.util.concurrent.*;

/**
 * Created by dev on 16/10/16.
 */
public class AddData {

    public static void main(String [] args) throws InterruptedException, ExecutionException{
        ExecutorService service = null;
        try{
            service = Executors.newSingleThreadExecutor();
            Future<Integer>  result = service.submit(() -> 30+11);
            System.out.print(result.get(10, TimeUnit.SECONDS));
        }catch (TimeoutException ex){
            System.out.println("this point has been reach");
        }finally {
            if(service == null){
                service.shutdown();
            }
        }
    }

}
