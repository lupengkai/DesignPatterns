package template;

/**
 * Created by tage on 8/8/16.
 */
public abstract class AbstractClass {
    protected abstract void doSomething();

    protected abstract void doAnything();

    public final void templateMethod() {
        this.doSomething();
        this.doAnything();
    }
}
