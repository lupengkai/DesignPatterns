package abstract_factory;

/**
 * Created by tage on 8/7/16.
 */
public class Creator2 extends AbstractCreator {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductA createProductB() {
        return new ProductB2();
    }
}
