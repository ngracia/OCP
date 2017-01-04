package chapter1;

/**
 * Created by dev on 04/01/17.
 */
public class Outer1 {
    private int length = 5;

    public void calculate(){
        int width = 20;

        class Inner {
            public void multiply(){
                System.out.println(length * width);
            }
        }

        Inner inner = new Inner();
        inner.multiply();
    }

    public static void main(String args []){
        Outer1 outer = new Outer1();
        outer.calculate();
    }
}
