package chapter1;

/**
 * Created by dev on 05/01/17.
 */
public class Enclosing {
    static class Nested {
        private int price = 6;
    }

    public static void main(String [] args){
        Nested nested = new Nested();
        System.out.println(nested.price);
    }
}