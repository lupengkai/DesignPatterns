package Strategy;

/**
 * Created by tage on 8/24/16.
 */
public class Client {
    public static void main(String[] args) {
        Strategy strategy = new ConcreteStragety1();

        Context context = new Context((strategy));
        context.doAnything();
    }
}
