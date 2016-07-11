package factory;

/**
 * Created by tage on 7/11/16.
 */
public class Client {
    public static void main(String[] args) {
        Creator creator = new ConcreateCreator();
        Product product = creator.createProduct(ConcreteProduct1.class);
    }
}
