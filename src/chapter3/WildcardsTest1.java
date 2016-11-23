package chapter3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dev on 22/11/16.
 */
public class WildcardsTest1 {
    public static void main(String args []){
        List<String> keywords = new ArrayList<>();
        keywords.add("java");
        printList(keywords);
    }

    public static void printList(List<?> list){
        for(Object x: list){
            System.out.println(x);
        }
    }
}
