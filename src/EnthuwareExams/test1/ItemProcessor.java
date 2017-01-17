package EnthuwareExams.test1;

import java.util.concurrent.CyclicBarrier;

/**
 * Created by Nestor Gracia on 1/10/2017.
 */
public class ItemProcessor implements Runnable {
    CyclicBarrier cb;

    public ItemProcessor(CyclicBarrier cb){
        this.cb = cb;
    }

    @Override
    public void run() {
        System.out.println("processed");
        try{
            cb.wait();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
