package proxy.dynamic;

/**
 * Created by tage on 8/11/16.
 */
public class BeforeAdvice implements IAdvice {
    @Override
    public void exec() {
        System.out.println("我是前置通知， 我被执行了！");
    }
}
