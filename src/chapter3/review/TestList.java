package chapter3.review;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by dev on 05/02/17.
 */
public class TestList {
    public static void main(String [] args){

        List<String> list = new ArrayList<>();
        list.add("SD");
        list.add(0, "NY");
        list.add(1, "FL");
        list.set(2, "DAL");
        list.remove("NY");
        list.remove("SD");

        list.add("NJ");
        String state = list.get(0);
        int index = list.indexOf("NJ");

        System.out.println(index);

        Iterator<String> iter = list.iterator();
        while (iter.hasNext()){
            String string = iter.next();
            System.out.println(string);
        }
    }
}
