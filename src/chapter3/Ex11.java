package chapter3;


import java.util.*;

/**
 * Created by dev on 14/11/16.
 */
public class Ex11 {
    public static void main(String [] args){
        Map<Integer, Integer> map = new HashMap<>(10);
        for(int i = 1; i <= 10; i++){
            map.put(i, i*i);
        }
        System.out.println(map.get(2));
    }

    public static<T>  T identity(T t){
        return t;
    }
}
