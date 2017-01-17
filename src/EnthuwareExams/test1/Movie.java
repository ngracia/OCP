package EnthuwareExams.test1;

/**
 * Created by Nestor Gracia on 1/9/2017.
 */
public class Movie
{
    static enum Genre {DRAMA, THRILLER, HORROR, ACTION };
    private Genre genre;
    private String name;
    private char rating = 'R';

    Movie(String name, Genre genre, char rating){
        this.name = name; this.genre = genre; this.rating = rating;
    }

    public Genre getGenre(){
        return genre;
    }

    public String getName(){
        return name;
    }

    public char getRating(){
        return rating;
    }
}
