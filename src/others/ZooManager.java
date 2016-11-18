package others;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dev on 22/10/16.
 */
public class ZooManager {

    private Map<String, Object> foodData = new HashMap<>();

    public synchronized void put(String key, String value){
        foodData.put(key, value);
    }
    public synchronized Object get(String key){
        return foodData.get(key);
    }
}
