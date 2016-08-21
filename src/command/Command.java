package command;

/**
 * Created by tage on 8/21/16.
 */
public abstract class Command {
    //抽象类中不加入receiver是因为不知道涉及多少receiver
    //receiver间没有相互关系，主要是协同完成一件事的先后顺序
    public abstract void execute();
}
