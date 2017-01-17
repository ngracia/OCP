package EnthuwareExams.test1;

/**
 * Created by Nestor Gracia on 1/10/2017.
 */
public class Book {
    private String isbn;
    public Book(String isbn){
        this.isbn = isbn;
    }

    public boolean equals(Object o){
        return (o instanceof Book && ((Book)o).isbn.equals(this.isbn));
    }

    public int hashCode(){
        return 100;
    }

    public String getIsbn(){
        return isbn;
    }
}
