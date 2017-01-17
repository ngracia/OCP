package EnthuwareExams.test1;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Nestor Gracia on 1/10/2017.
 */
public class Question41 {
    public static void main(String [] args){
        List<Integer> ls = Arrays.asList(3,4,6,9,2,5,7);
        System.out.println(ls.stream().reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b));
        System.out.println(ls.stream().max(Integer::max).get());
        System.out.println(ls.stream().max(Integer::compare).get());
        System.out.println(ls.stream().max((a,b) -> a>b?a:b));
    }
}
