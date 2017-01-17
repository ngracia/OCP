package chapter2.review;

/**
 * Created by dev on 06/01/17.
 */
public class StaffRegister {
    private static final StaffRegister instance;

    static {
        instance = new StaffRegister();
    }

    private StaffRegister(){}

    public static StaffRegister getInstance(){
        return instance;
    }
}
