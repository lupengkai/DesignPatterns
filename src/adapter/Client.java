package adapter;

/**
 * Created by tage on 8/30/16.
 */
public class Client {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();
        Target target2 = new Adapter();
        target2.request();
    }
}
