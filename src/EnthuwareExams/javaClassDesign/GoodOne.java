package EnthuwareExams.javaClassDesign;

import sun.java2d.opengl.GLXSurfaceData;

/**
 * Created by dev on 22/01/17.
 */
public class GoodOne {
    int theval;

    @Override
    public int hashCode(){
        return theval%3;
    }

    @Override
    public boolean equals(Object obj){
        try{
            return this == obj ? true : (theval%3 == 0 && ((GoodOne)obj).theval%3 == 0) ? true : false;
        }catch (Exception ex){
            return false;
        }
    }

    public static void main(String args []){
        GoodOne goodOne1 = new GoodOne();
        goodOne1.theval = 6;

        GoodOne goodOne2 = new GoodOne();
        goodOne2.theval = 3;

        System.out.print(goodOne1.equals(goodOne2));

    }
}
