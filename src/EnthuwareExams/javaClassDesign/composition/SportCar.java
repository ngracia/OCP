package EnthuwareExams.javaClassDesign.composition;

/**
 * Created by dev on 22/01/17.
 */
public class SportCar {
    Car c;
    public void accelerate(){
        //delegate the call to car
        c.accelarate();
    }
}
