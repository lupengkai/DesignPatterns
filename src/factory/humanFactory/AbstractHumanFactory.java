package factory.humanFactory;

/**
 * Created by tage on 7/11/16.
 */
public abstract class AbstractHumanFactory {
    public abstract <T extends Human> T createHuman(Class<T> c);
}
