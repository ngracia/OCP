/**
 * Created by dev on 22/10/16.
 */
public class SizeLimitedCrate <T, U> {
    private T contents;
    private U sizeLimit;
    public SizeLimitedCrate(T contents, U sizeLimit){
        this.sizeLimit = sizeLimit;
        this.contents = contents;
    }
}
