package factory.simpleHumanFactory;

/**
 * Created by tage on 7/11/16.
 */
public class BlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黑色");
    }

    @Override
    public void talk() {
        System.out.println("黑人说话了");
    }
}
