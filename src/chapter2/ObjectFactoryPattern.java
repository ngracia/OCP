package chapter2;

/**
 * Created by dev on 21/11/16.
 */
public abstract class ObjectFactoryPattern {

    private int quantity;

    public ObjectFactoryPattern(int quantity)
    {
        this.quantity = quantity;
    }

    public int getQuantity(){
        return quantity;
    }

    public abstract void Consumed();
}
