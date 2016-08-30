package adapter;

/**
 * Created by tage on 8/30/16.
 */
public class Adapter extends Source implements Target {
    @Override
    public void request() {
        super.doSomething();
    }
}
