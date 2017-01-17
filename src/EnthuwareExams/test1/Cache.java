package EnthuwareExams.test1;


import chapter1.Enclosing;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Nestor Gracia on 1/9/2017.
 */
public class Cache {
    static ConcurrentHashMap<String, Object> chm = new ConcurrentHashMap<>();

    public static void main(String [] args){
        chm.put("a","aaa");
        chm.put("b","bbb");
        chm.put("c","ccc");

        new Thread(){
            public void run(){
                Iterator<Map.Entry<String, Object>> it = Cache.chm.entrySet().iterator();
                while(it.hasNext()){
                    Map.Entry<String, Object> en = it.next();
                    if(en.getKey().equals("a") || en.getKey().equals("b")){
                        it.remove();
                    }
                }
            }
        }.start();

        new Thread(){
            public void run(){
                Iterator<Map.Entry<String, Object>> it = Cache.chm.entrySet().iterator();
                while(it.hasNext()){
                    Map.Entry<String, Object> en = it.next();
                    System.out.println(en.getKey() + ", ");
                }
            }
        }.start();
    }
}
