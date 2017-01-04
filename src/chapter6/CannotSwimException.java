package chapter6;


/**
 * Created by dev on 11/12/16.
 */
public class CannotSwimException extends Exception {

    public CannotSwimException(){
        super();
    }

    public CannotSwimException(Exception e){
        super(e);
    }

    public CannotSwimException(String message){
        super(message);
    }
}
