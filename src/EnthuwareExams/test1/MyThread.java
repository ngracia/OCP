package EnthuwareExams.test1;

/**
 * Created by Nestor Gracia on 1/10/2017.
 */
public class MyThread implements Runnable {

    String msg = "default";

    public MyThread(String s){
        msg = s;
    }

    @Override
    public void run(){
        System.out.println(msg);
    }

    public static void main(String [] args){
        new Thread(new MyThread("String1")).run();
        new Thread(new MyThread("String2")).run();
        System.out.println("end");
    }
}
