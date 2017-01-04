package chapter7;

/**
 * Created by dev on 22/12/16.
 */
public class ReadInvetoryThread extends Thread {

    @Override
    public void run(){
        System.out.println("Printing zoo inventory");
    }

    public static void main(String [] args){
        (new ReadInvetoryThread()).start();
    }
}
