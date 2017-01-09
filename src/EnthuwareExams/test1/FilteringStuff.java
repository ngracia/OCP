package EnthuwareExams.test1;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Nestor Gracia on 1/9/2017.
 */
public class FilteringStuff {
    public static void main(String [] args){
        List<Movie> movies = Arrays.asList(new Movie("Titanic", Movie.Genre.DRAMA, 'U'),
                new Movie("Psyco", Movie.Genre.THRILLER, 'U'),
                new Movie("Oldboy", Movie.Genre.THRILLER, 'R'),
                new Movie("Shining", Movie.Genre.HORROR, 'U'));

        movies.stream()
                .filter(mov -> mov.getRating() == 'R')
                .peek(mov -> System.out.println(mov.getName()))
                .map(mov -> mov.getName());
    }
}
