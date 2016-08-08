package template;

/**
 * Created by tage on 8/8/16.
 */


//父类调用子类方法 一个方法调多个方法 框架中常见
public class Client {
    public static void main(String[] args) {
        AbstractClass class1 = new ConcreteClass1();
        AbstractClass class2 = new ConcreteClass2();

        class1.templateMethod();
        class2.templateMethod();


    }
}
