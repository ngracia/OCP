package EnthuwareExams.test1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by Nestor Gracia on 1/6/2017.
 */
public class Question3 {
    public static void main (String [] args){
        Map hm = new ConcurrentHashMap();
        hm.put(null, "asdf");
        hm.put(null, null);

        hm = new HashMap();
        hm.put(null, "asdf");
        hm.put("aaa", null);

        List list = new ArrayList();
        list.add(null);
        list.add(null);

        list = new CopyOnWriteArrayList();
        list.add(null);
    }
}
