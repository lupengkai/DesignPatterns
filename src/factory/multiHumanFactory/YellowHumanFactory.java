package factory.multiHumanFactory;

/**
 * Created by tage on 7/11/16.
 */
public class YellowHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createHuman() {
        return new YellowkHuman();
    }
}
