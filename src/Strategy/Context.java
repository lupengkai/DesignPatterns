package Strategy;

/**
 * Created by tage on 8/24/16.
 */
public class Context {
    private Strategy strategy = null;

    public Context(Strategy _strategy) {
        this.strategy = _strategy;
    }

    public void doAnything() {
        this.strategy.doSomething();
    }

}
