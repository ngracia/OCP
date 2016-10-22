import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by dev on 22/10/16.
 */
public class ReviewingList {
    public static void main(String [] args) {
        List<Integer> list = Arrays.asList(1,3,4);
        Collections.sort(list);
        System.out.println(Collections.binarySearch(list, 2));

    }
}
