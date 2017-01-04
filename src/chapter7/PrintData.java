package chapter7;

/**
 * Created by dev on 22/12/16.
 */
public class PrintData implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i<3; i++){
            System.out.println("hola" + i);
        }
    }

    public static void main(String [] args){
        (new Thread(new PrintData())).start();
    }
}
