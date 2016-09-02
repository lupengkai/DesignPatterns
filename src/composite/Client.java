package composite;

/**
 * Created by tage on 9/2/16.
 */
public class Client {
    public static void main(String[] args) {
        Composite root = new Composite();
        root.doSomething();

        Composite branch = new Composite();

        Leaf leaf = new Leaf();
        root.add(branch);
        branch.add(leaf);
    }


    public static void display(Composite root) {
        for (Component c : root.getChilden()) {
            if (c instanceof Leaf) {
                c.doSomething();
            } else {
                display((Composite) c);
            }
        }
    }
}
