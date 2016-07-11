package factory.humanFactory;

/**
 * Created by tage on 7/11/16.
 */
public class NvWa {
    public static void main(String[] args) {
        AbstractHumanFactory YinYangLu = new HumanFactory();

        Human blackHuman = YinYangLu.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();
    }
}
