package chapter2.review;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nestor Gracia on 1/7/2017.
 */
public final class AnimalImmutable {
    private final List<String>  favoriteFoods;

    public AnimalImmutable(List<String> favoriteFoods){
        if(favoriteFoods == null){
            throw new RuntimeException("FavoriteFoods is requerired");
        }
        this.favoriteFoods = new ArrayList<>(favoriteFoods);
    }

    public List<String> getFavoriteFoods(){
        return new ArrayList<>(favoriteFoods);
    }

}
