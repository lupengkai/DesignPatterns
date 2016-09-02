package composite;

import java.util.ArrayList;

/**
 * Created by tage on 9/2/16.
 */
public class Composite extends Component {
    private ArrayList<Component> componentArrayList = new ArrayList<>();

    public void add(Component component) {
        this.componentArrayList.add(component);
    }


    public void remove(Component component) {
        this.componentArrayList.remove(component);
    }


    public ArrayList<Component> getChilden() {
        return this.componentArrayList;
    }
}
