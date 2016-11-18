package others;

import java.util.*;
/**
 * Created by dev on 22/10/16.
 */
public class UnderstandingMemoryConsistencyErrors {


    public static void main(String args[]){
        Map<String, Object> foodData = new HashMap<>();
        foodData.put("penguin", 1);
        foodData.put("flamingo", 2);

        for(String key: foodData.keySet()){
            foodData.keySet();
        }
    }
}
