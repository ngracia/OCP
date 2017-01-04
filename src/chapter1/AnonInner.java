package chapter1;

/**
 * Created by dev on 04/01/17.
 */
public class AnonInner {
    abstract class SaleTodayOnly{
        abstract int dollarsOff();
    }

    /*public int admission(int basePrice){
        SaleTodayOnly sale = new SaleTodayOnly() {
            @Override
            int dollarsOff() {
                return 3;
            }

            //return basePrice - sale.dollars
        }
    }*/
}
