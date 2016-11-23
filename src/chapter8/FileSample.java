package chapter8;

import java.io.File;
import java.util.function.Consumer;

/**
 * Created by dev on 22/11/16.
 */
public class FileSample {
    public static void main(String [] args){
        Consumer<Boolean> consumer = System.out::println;
        File file = new File("/home/dev/Git/IdeaProjects/OCP/src/chapter8/hola.txt");
        consumer.accept(file.exists());
    }
}