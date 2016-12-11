package chapter8;

import java.io.*;

/**
 * Created by dev on 30/11/16.
 */
public class TestOne {
    public static void main(String [] args){
        test1();
    }

    public static void test1(){
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("chapter8/zoo-data.txt"))){
            System.out.println(bufferedReader.readLine());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void test2(){
         try(ObjectInputStream objectStream = new ObjectInputStream(new BufferedInputStream(new FileInputStream("chapter8/zoo-data.txt")))){
             System.out.println(objectStream.readObject());
        } catch (ClassNotFoundException e) {
             e.printStackTrace();
         } catch (IOException e) {
             e.printStackTrace();
         }
    }
}
