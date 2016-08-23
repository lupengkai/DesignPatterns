package decorator;

/**
 * Created by tage on 8/23/16.
 */
public class ComponentDecorator2 extends Decorator{
    public ComponentDecorator2(Component _component) {
        super(_component);
    }


    private void method2() {
        System.out.println("method1 修饰");
    }

    public void operate() {
        this.method2();
        super.operate();
    }
}
