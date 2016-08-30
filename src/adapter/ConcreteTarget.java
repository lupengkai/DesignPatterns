package adapter;

/**
 * Created by tage on 8/30/16.
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("if you need help, pls call me!");
    }
}
