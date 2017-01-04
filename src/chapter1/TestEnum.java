package chapter1;

/**
 * Created by dev on 04/01/17.
 */
public class TestEnum {
    public static void main(String [] args){
         for(Season s : Season.values()){
             s.printExpectedVisitors();
         }
         System.out.println(Season.FALL);

         Season2.FALL.printHours();
    }
}
