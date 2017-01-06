package FunctionalProgramming;

/**
 * Created by dev on 06/01/17.
 */
@FunctionalInterface
public interface FunctionOverTime {
    double valueAt(int time);

    static FunctionOverTime monthByMonth(final double [] values){
        return time -> values [time - 1];
    }

    static FunctionOverTime constant(final double value){
        return time -> value;
    }

    static FunctionOverTime line(final double intercept, final  double slope){
        return time -> intercept + time * slope;
    }
}
