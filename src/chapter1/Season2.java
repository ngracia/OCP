package chapter1;

/**
 * Created by dev on 04/01/17.
 */
public enum Season2 {

    WINTER {
        public void printHours() { System.out.println("9am-3am");}
    }, SPRING {
        public void printHours() { System.out.println("9am-5am");}
    }, SUMMER {
        public void printHours() { System.out.println("9am-7am");}
    }, FALL {
        public void printHours() { System.out.println("9am-5am");}
    };

    public abstract void printHours();
}
