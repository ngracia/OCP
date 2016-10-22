import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by dev on 22/10/16.
 */

public class ZooManagerConcurrentCollectionClass {
    private Map<String, Object> map = new ConcurrentHashMap<>();

    public void put(String key, Object value){
        map.put(key, value);
    }

    public Object get(String key){
        return map.get(key);
    }
}
