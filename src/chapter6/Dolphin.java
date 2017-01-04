package chapter6;

/**
 * Created by dev on 11/12/16.
 */
public class Dolphin {
    public static void main(String args [] ) {
        try{
            throw new CannotSwimException("this is an error message to try on of the constructors");
        }catch (CannotSwimException ex){
            ex.printStackTrace();
        }

    }
}
