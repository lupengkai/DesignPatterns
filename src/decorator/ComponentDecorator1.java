package decorator;

/**
 * Created by tage on 8/23/16.
 */
public class ComponentDecorator1 extends Decorator{
    public ComponentDecorator1(Component _component) {
        super(_component);
    }


    private void method1() {
        System.out.println("method1 修饰");
    }

    public void operate() {
        this.method1();
        super.operate();
    }
}
