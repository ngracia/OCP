package chapter1;

/**
 * Created by dev on 05/01/17.
 */
public class AnnonInner1 {
    interface SalesTodayOnly{
        int dollarsOff();
    }

    public int pay(){
        return admission(5, () -> 3);
    }

    public int admission(int basePrice, SalesTodayOnly sale){
        return basePrice - sale.dollarsOff();
    }
}
