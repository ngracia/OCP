package others;

/**
 * Created by dev on 22/10/16.
 */
public class Crate<T> {
    private T contents;
    public T emptyCrate(){
        return contents;
    }

    public void packCrate(T contents){
        this.contents = contents;
    }
}
