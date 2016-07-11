package factory.humanFactory;

/**
 * Created by tage on 7/11/16.
 */
public class YellowkHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黄色");
    }

    @Override
    public void talk() {
        System.out.println("黄色人说话了");
    }
}
