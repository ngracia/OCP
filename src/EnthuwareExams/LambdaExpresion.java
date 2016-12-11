package EnthuwareExams;

import chapter4.IntermediateOperations;

import java.lang.invoke.ConstantCallSite;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by dev on 08/12/16.
 */
public class LambdaExpresion {
    public static void main(String [] args){

    }

    public static void exercise01(){
        Consumer<Integer> consumer = System.out::println;

        List<Integer> ls = Arrays.asList(3,4,6,9,2,7);

    }
}
