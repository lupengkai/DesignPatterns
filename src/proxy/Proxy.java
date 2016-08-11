package proxy;

/**
 * Created by tage on 8/10/16.
 */
public class Proxy implements Subject {
    private Subject subject = null;

    public Proxy() {
        this.subject= new Proxy();
    }

    public Proxy(Object...objects) {

    }

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        this.before();
        this.subject.request();
        this.after();
    }


    private void before() {

    }

    private void after() {

    }


}
