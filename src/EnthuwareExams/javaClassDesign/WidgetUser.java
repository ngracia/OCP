package EnthuwareExams.javaClassDesign;

/**
 * Created by dev on 31/01/17.
 */

class Widget {
    String data = "data";
    public void doWidgetStuff(){
        System.out.println(data);
    }
}

class GoodWidget extends Widget {
    String data = "bit data";

    public void doWidgetStuff(){

    }
}

public class WidgetUser {
    public static void main(String [] args){
        Widget w = new GoodWidget();
        ((Widget)w).doWidgetStuff();
    }
}
