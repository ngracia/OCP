package chapter2;

/**
 * Created by dev on 20/11/16.
 */
public class HayStorage {

    private int quantity = 0;

    private HayStorage(){

    }

    private static final HayStorage instance = new HayStorage();

    public static HayStorage getInstance(){
        return instance;
    }
}
