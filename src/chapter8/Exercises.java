package chapter8;

import java.io.*;

/**
 * Created by dev on 11/12/16.
 */
public class Exercises {
    public static void main(String args []) throws IOException{
        Exercises exercises = new Exercises();
        exercises.oldWay();
    }

    public void exe_1() throws IOException{
        InputStream is = new BufferedInputStream(new FileInputStream("zoo.txt"));
        InputStream wrapper = new BufferedInputStream(is);
    }

    public void lowLeveStream(){
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("chapter8/zoo-data.txt"))){
            System.out.println(bufferedReader.readLine());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void oldWay() throws IOException{

    }


}
