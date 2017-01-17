package chapter2.review;

/**
 * Created by dev on 06/01/17.
 */
public class VisitorTicketTracker {

    private static VisitorTicketTracker instance;
    private VisitorTicketTracker(){}

    public static VisitorTicketTracker getInstance(){
        if(instance == null){
            instance = new VisitorTicketTracker();
        }

        return instance;
    }
}
