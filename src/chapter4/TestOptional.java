package chapter4;

import java.util.Optional;

/**
 * Created by dev on 15/11/16.
 */
public class TestOptional {
    public static void main(String args []){
        System.out.println(average());
        System.out.println(average(90,100));

        Optional<Double> optional = average(90,100);
        if(optional.isPresent()){
            System.out.println(optional.get());
        }
    }

    public static Optional<Double> average(int ... scores){
        if(scores.length == 0){
            return Optional.empty();
        }

        int sum = 0;
        for(int score: scores){
            sum += score;
        }

        return Optional.of((double) sum / scores.length);
    }
}
