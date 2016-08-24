package singleton;

/**
 * Created by tage on 7/11/16.
 */
public class Singleton {//饿汉
    private static final Singleton singleton = new Singleton();

    private Singleton() {

    }

    public static void doSomething() {

    }

    public Singleton getSingleton() {
        return singleton;
    }
}
