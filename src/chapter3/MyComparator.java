package chapter3;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by dev on 14/11/16.
 */
public class MyComparator implements Comparator<String> {

    public int compare(String a, String b){
        return b.toLowerCase().compareTo(a.toLowerCase());
    }

    public static void main(String [] args){
        String[] values = { "123", "Abb", "aab"};
        Arrays.sort(values, new MyComparator());
        for(String s: values){
            System.out.println(s + " ");
        }
    }
}
