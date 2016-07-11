package factory.multiHumanFactory;

/**
 * Created by tage on 7/11/16.
 */
public class NvWa {
    public static void main(String[] args) {
        Human blackHuman = (new BlackHumanFactory()).createHuman();
    }
}
