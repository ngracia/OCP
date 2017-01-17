package chapter2.review;

/**
 * Created by dev on 06/01/17.
 */
public class LlamaTrainer {
    public boolean feedLlmas(int numberOfLlamas){
        int amountNeeded = 5 * numberOfLlamas;
        HayStorage hayStorage = HayStorage.getInstance();
        if(hayStorage.getHayQuantity() < amountNeeded){
            hayStorage.addHay(amountNeeded + 10);
        }

        boolean fed = hayStorage.removeHay(amountNeeded);
        if(fed) System.out.println("Llamas have been fed");
        return fed;
    }
}
