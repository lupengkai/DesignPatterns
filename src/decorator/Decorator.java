package decorator;

/**
 * Created by tage on 8/23/16.
 */
public class Decorator extends Component {
    private Component component = null;

    public Decorator(Component _component) {
        this.component = _component;
    }


    @Override
    public void operate() {
        this.component.operate();
    }
}
