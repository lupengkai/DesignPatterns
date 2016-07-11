package factory.multiHumanFactory;

/**
 * Created by tage on 7/11/16.
 */
public class BlackHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createHuman() {
        return new BlackHuman();
    }
}
