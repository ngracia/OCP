package chapter8;

import java.io.Console;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by dev on 11/12/16.
 */
public class ConcoleSample {
    public static void main(String [] args) throws IOException{
        String line;
        Console c = System.console();
        Writer w = c.writer();
        if((line = c.readLine()) != null){
            w.append(line);
        }
        w.flush();
    }
}
