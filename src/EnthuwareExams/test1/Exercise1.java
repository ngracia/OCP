package EnthuwareExams.test1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Nestor Gracia on 1/6/2017.
 */
public class Exercise1 {
    public static void main(String [] args){
        //Map<String, List<String>> stateCitiesMap = new HashMap<>();
        Map<String, List<String>> stateCitiesMap = new HashMap<String, List<String>>();
        List<String>  cities = new ArrayList<>();
        cities.add("New York");
        cities.add("Albany");
        stateCitiesMap.put("NY", cities);

    }
}
