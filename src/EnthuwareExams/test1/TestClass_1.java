package EnthuwareExams.test1;

import java.util.Arrays;

/**
 * Created by Nestor Gracia on 1/9/2017.
 */
public class TestClass_1 {
    static String[] sa = {"a", "aa", "aaa", "aaaa" };
    static
    {
        Arrays.sort(sa);
    }

    public static void main(String [] args){
        String search = "";
        if(args.length !=0) search = args[0];
        System.out.print(Arrays.binarySearch(sa, search));
    }
}
