package template;

/**
 * Created by tage on 8/8/16.
 */
public abstract class AbstractClass {
    protected abstract void doSomething();

    protected abstract void doAnything();

    public final void templateMethod() {//this方法多态 只有方法有多态 属性没有 得看具体引用
        this.doSomething();
        this.doAnything();
    }
}
