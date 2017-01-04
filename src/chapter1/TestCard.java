package chapter1;

/**
 * Created by dev on 04/01/17.
 */
public class TestCard {
    public static void main(String [] args){
        Card card1 = new Card("Test1", "Test2");
        Card card2 = new Card("Test1", "Test2");
        System.out.println(card2.equals(card1));
    }
}
