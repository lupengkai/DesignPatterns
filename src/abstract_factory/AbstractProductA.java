package abstract_factory;

/**
 * Created by tage on 8/7/16.
 */
public abstract class AbstractProductA {
    //每个产品共有的方法
    public void shareMehtod() {

    }

    //每个产品相同方法，不同实现
    public abstract void doSomething();
}
