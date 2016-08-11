package builder;

/**
 * Created by tage on 8/10/16.
 */
public class Director {
    private Builder builder = new ConcreteProduct();

    public Product getProduct() {
        builder.settPart();

        return builder.buildProduct();
    }
}
