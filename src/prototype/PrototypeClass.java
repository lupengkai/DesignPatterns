package prototype;

/**
 * Created by tage on 8/12/16.
 */
public class PrototypeClass implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        PrototypeClass prototypeClass = null;
        try {
            prototypeClass = (PrototypeClass) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototypeClass;
    }
}
