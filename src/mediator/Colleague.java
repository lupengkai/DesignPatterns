package mediator;

/**
 * Created by tage on 8/21/16.
 */
public abstract class Colleague {
    protected Mediator mediator;

    //使用初始化 是因为必须有中介者的参与
    public Colleague(Mediator _mediator) {
        this.mediator = _mediator; 
    }
}
