package mediator;

/**
 * Created by tage on 8/21/16.
 */
public abstract class Mediator {
    protected ConcreteColleague1 c1;//具体类 具体类有不同的自己的方法
    protected ConcreteColleague2 c2;//如果大家有相同的方法可以注入抽象类


    //使用注入是因为可以只有部分同事参与
    public ConcreteColleague1 getC1() {
        return c1;
    }

    public void setC1(ConcreteColleague1 c1) {
        this.c1 = c1;
    }

    public ConcreteColleague2 getC2() {
        return c2;
    }

    public void setC2(ConcreteColleague2 c2) {
        this.c2 = c2;
    }


    public abstract void doSomething1();

    public abstract void doSomething2();


}
