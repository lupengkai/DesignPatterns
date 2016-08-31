package Iterator;

/**
 * Created by tage on 8/31/16.
 */
public class ConcreteIterator implements Iterator {

    private int cursor = 0;

    @Override
    public Object next() {
        return null;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public boolean remove() {
        return false;
    }
}
