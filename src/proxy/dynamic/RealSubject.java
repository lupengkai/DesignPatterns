package proxy.dynamic;


/**
 * Created by tage on 8/11/16.
 */
public class RealSubject implements Subject{
    @Override
    public void doSomething(String str) {
        System.out.println("do something!--->" + str);
    }


}
