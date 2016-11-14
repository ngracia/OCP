package Chapter3;

/**
 * Created by dev on 14/11/16.
 */
public class Hello<T> {
    T t;
    public Hello(T t){
        this.t = t;
    }

    public String toString(){
        return t.toString();
    }

    public static void main(String [] args){
        System.out.print(new Hello<>(7));
        System.out.print(new Hello(8));
    }
}
