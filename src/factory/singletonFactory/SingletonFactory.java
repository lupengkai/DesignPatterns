package factory.singletonFactory;

import java.lang.reflect.Constructor;

/**
 * Created by tage on 7/11/16.
 */
public class SingletonFactory {
    private static Singleton singleton;
    static {
        try {
            Class cl = Class.forName(Singleton.class.getName());
            Constructor constructor = cl.getDeclaredConstructor();
            constructor.setAccessible(true);
            singleton = (Singleton) constructor.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static Singleton getSingleton() {
        return singleton;
    }
}
