package EnthuwareExams.test1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Nestor Gracia on 1/10/2017.
 */
public class BookStore {
    Map<Book, Integer> map = new HashMap<>();

    public BookStore(){
        Book b = new Book("A111");
        map.put(b, 10);
        b = new Book("B222");
        map.put(b, 5);
    }

    Integer getNumberOfCopies(Book b){
        return map.get(b);
    }

    public static void main(String [] args){
        BookStore bs = new BookStore();
        Book b = new Book("A111");
        System.out.println(bs.getNumberOfCopies(b));
    }
}
