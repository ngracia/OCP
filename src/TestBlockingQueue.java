import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/**
 * Created by dev on 24/10/16.
 */
public class TestBlockingQueue {
    public static void main(String [] args){
        try{
            BlockingQueue<Integer> blockingQueue = new LinkedBlockingDeque<>();
            blockingQueue.offer(39);
            blockingQueue.offer(3,4, TimeUnit.SECONDS);
        }catch (InterruptedException ex){

        }
    }
}

