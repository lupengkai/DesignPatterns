package command;

/**
 * Created by tage on 8/21/16.
 */
public class ConcreteCommand1 extends Command {//如果receiver有多个就得重新创建类，不用改变抽象基类
    private Receiver receiver;

    public ConcreteCommand1(Receiver _receiver) {
        this.receiver = _receiver;
    }
    @Override
    public void execute() {
        this.receiver.doSomething();
    }
}
