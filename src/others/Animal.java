package others;
/**
 * Created by dev on 15/10/16.
 */
public class Animal {
    private String species;
    private boolean canHop;
    private boolean canSwim;


    public Animal(String species, boolean hopper, boolean swimmer){
        this.species = species;
        this.canSwim = swimmer;
        this.canHop = hopper;
    }

    public boolean canHop(){
        return canHop;
    }

    public boolean canSwim() {
        return canSwim;
    }

    public String toString(){
        return species;
    }
}
