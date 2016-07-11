package factory.simpleHumanFactory;

/**
 * Created by tage on 7/11/16.
 */
public class HumanFactory {

    public static <T extends Human> T createHuman(Class<T> c) {
        Human human = null;
        try {
            human = (T) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return (T) human;
    }
}
