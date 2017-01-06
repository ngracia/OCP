package FunctionalProgramming;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntToDoubleFunction;

/**
 * Created by dev on 06/01/17.
 */
public class MinimunLambdaExamples {
    public static void main(final String[] args){
        IntToDoubleFunction intToDoubleFunction = time -> 5.1 + 0.015 * time;

        Function<String, Integer> wordCount = (String s) -> s.split(" ").length;

        /*BiFunction<String, Integer, Boolean> exceedsMaxLength = (s, maxLength) -> {
            int actualLength = s.length();
            return actualLength > maxLenght;
        };*/
    }
}
