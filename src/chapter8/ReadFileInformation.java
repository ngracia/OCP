package chapter8;

import java.io.File;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;

/**
 * Created by dev on 29/11/16.
 */
public class ReadFileInformation {
    public static void main(String [] args){
        Consumer<String> consumer = System.out::println;
        File file = new File("/home/dev/zoo.txt");
        consumer.accept("File Exists: " + file.exists());
        if(file.exists()){
            consumer.accept("Absolute Path: " + file.getAbsolutePath());
            consumer.accept("Is Directory: " + file.isDirectory());
            consumer.accept("Absolute Path: " + file.getParent());
            if(file.isFile()){
                consumer.accept("File size: " + file.length());
                consumer.accept("File LastModified: " + file.lastModified());
            }else{
                for(File subfile : file.listFiles()){
                    consumer.accept("\t" + subfile.getName());
                }
            }
        }
    }
}
