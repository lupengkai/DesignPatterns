package factory.lazyInitialization;

/**
 * Created by tage on 7/11/16.
 */
public class Client {
    public static void main(String[] args)  throws Exception{

        Product product = ProductFactory.createProduct("Product1");
        Product product2 = ProductFactory.createProduct("Product1");

        System.out.println( product==product2);

    }
}
