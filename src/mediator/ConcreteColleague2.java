package mediator;

/**
 * Created by tage on 8/21/16.
 */
public class ConcreteColleague2 extends Colleague {

    public ConcreteColleague2(Mediator _mediator) {
        super(_mediator);
    }

    public void selfMethod1() {//自由方法 不与其他类交互

    }

    public void selfMethod2() {

    }

    public void depMethod() {//与其他类交互的方法
        super.mediator.doSomething1();
    }
}
