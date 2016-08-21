package command;

/**
 * Created by tage on 8/21/16.
 */
public class ConcreteCommand2 extends Command {
    private Receiver receiver;

    public ConcreteCommand2(Receiver _receiver) {
        this.receiver = _receiver;
    }

    @Override
    public void execute() {
        this.receiver.doSomething();
    }
}
