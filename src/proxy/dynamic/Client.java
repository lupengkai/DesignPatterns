package proxy.dynamic;


import java.lang.reflect.InvocationHandler;

/**
 * Created by tage on 8/11/16.
 */
public class Client {
    public static void main(String[] args) {
        Subject subject = new RealSubject();
        InvocationHandler invocationHandler = new MyInvocationHandler(subject);

        Subject proxy = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(),
                subject.getClass().getInterfaces(),invocationHandler);
        proxy.doSomething("Finish");
    }
}
