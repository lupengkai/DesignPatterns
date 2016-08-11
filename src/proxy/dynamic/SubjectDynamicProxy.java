package proxy.dynamic;


import java.lang.reflect.InvocationHandler;

/**
 * Created by tage on 8/11/16.
 */
public class SubjectDynamicProxy extends DynamicProxy{
    public static <T> T newProxyInstance(Subject subject) {
        ClassLoader loader = subject.getClass().getClassLoader();
        Class<?>[] interfaces = subject.getClass().getInterfaces();
        InvocationHandler handler = new MyInvocationHandler(subject);
        return newProxyInstance(loader, interfaces, handler);
    }

}
