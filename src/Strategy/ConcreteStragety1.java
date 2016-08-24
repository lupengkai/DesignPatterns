package Strategy;

/**
 * Created by tage on 8/24/16.
 */
public class ConcreteStragety1 implements Strategy {
    @Override
    public void doSomething() {
        System.out.println("策略1具体做的事情");
    }
}
