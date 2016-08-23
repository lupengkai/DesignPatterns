package decorator;

/**
 * Created by tage on 8/23/16.
 */
public class ConcreteComponent  extends  Component{
    @Override
    public void operate() {
        System.out.println("do something");
    }
}
