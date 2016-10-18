import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.function.Consumer;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by dev on 18/10/16.
 */
public class TestSreamPrimitive {
    public static void main(String [] args){
        IntStream stream = IntStream.of(1,2,3);
        stream.forEach(System.out::println);
        TestSreamPrimitive test = new TestSreamPrimitive();
        test.TestDoubleStream();

    }

    private void TestDoubleStream(){

        Consumer<Double> consumer = (x)->System.out.print(x);

        DoubleStream stream = DoubleStream.generate(Math::random);
        DoubleStream fractions = DoubleStream.iterate(.5, d -> d/2);

        stream.limit(3).peek(System.out::println).forEach(System.out::println);
    }
}
