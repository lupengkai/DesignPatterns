package decorator;

/**
 * Created by tage on 8/23/16.
 */
public class Client {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        component = new ComponentDecorator1(component);
        component.operate();
        component = new ComponentDecorator2(component);
        component.operate();
    }
}
