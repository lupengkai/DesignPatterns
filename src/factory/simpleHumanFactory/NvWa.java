package factory.simpleHumanFactory;

/**
 * Created by tage on 7/11/16.
 */
public class NvWa {
    public static void main(String[] args) {


        Human blackHuman = HumanFactory.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();
    }
}
