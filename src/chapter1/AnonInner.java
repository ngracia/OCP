package chapter1;

/**
 * Created by dev on 04/01/17.
 */
public class AnonInner {
    interface SaleTodayOnly{
        int dollarsOff();
    }

    public int admission(int basePrice){
        SaleTodayOnly sale = new SaleTodayOnly() {
            @Override
            public int dollarsOff() {
                return 3;
            }
        };
        return basePrice - sale.dollarsOff();
    }
}
