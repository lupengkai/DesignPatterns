package command;

/**
 * Created by tage on 8/21/16.
 */
public class Invoker {
    private Command command;

    public void setCommand(Command _command) {
        this.command = _command;
    }

    public void action() {
        this.command.execute();
    }
}
