package chapter1;

/**
 * Created by dev on 04/01/17.
 */
public enum Season {
    WINTER("Low"), SPRING("Medium"), SUMMER("High"), FALL("Medium");

    private String expectedVisitors;

    Season(String expectedVisitors){
        this.expectedVisitors = expectedVisitors;
        //System.out.println(expectedVisitors);
    }

    public void printExpectedVisitors(){
        System.out.println(expectedVisitors);
    }
}
