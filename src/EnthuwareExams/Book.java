package EnthuwareExams;

import java.util.function.Supplier;

/**
 * Created by dev on 08/12/16.
 */
public class Book {
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    private Double price;

    public Book(String title, Double price){
        this.title = title;
        this.price = price;
    }

    public static void main(String [] args){
        Book b1 = new Book("Java in 24 hrs", 30.0);
        Book b2 = new Book("Java in 24 hrs",  null);

        Supplier s1 = b1::getPrice;
        System.out.println(b1.getTitle() + " " + s1.get());

        Supplier s2 = b2::getPrice;
        /*System.out.println(b2.getTitle()+ " " + s2.getAsDouble);*/
    }

}
