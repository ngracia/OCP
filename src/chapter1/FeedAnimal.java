package chapter1;

/**
 * Created by dev on 03/01/17.
 */
public class FeedAnimal {
    public static void main(String [] args){

        FeedAnimal feed = new FeedAnimal();
        feed.feedingAnimal(new Cow());
        feed.feedingAnimal(new Bird());
        feed.feedingAnimal(new Lion());
    }

    public void feedingAnimal(Animal animal){
        animal.feed();
    }
}
