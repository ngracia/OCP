package chapter4;

import java.util.stream.Stream;

/**
 * Created by dev on 15/11/16.
 */
public class Exer1 {
    public static void main(String [] args){
        Stream<String> stream = Stream.iterate("", (s) -> s + "1");
        System.out.println(stream.limit(2).map(x -> x + "2"));
    }
}
