package chapter8;

import java.io.Console;

/**
 * Created by dev on 11/12/16.
 */
public class ConcoleSample {
    public static void main(String [] args){
        Console console = System.console();
        if(console != null){
            String userInput = console.readLine();
            console.writer().println("You entered the following: " + userInput);
        }
    }
}
