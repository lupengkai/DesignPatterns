package chainOfResponsibility;

/**
 * Created by tage on 8/22/16.
 */
public class ConcreteHandler3 extends Handler {
    @Override
    protected Level getHandlerLevel() {
        //设置处理级别
        return  null;
    }

    @Override
    protected Response echo(Request request) {
        //设置处理逻辑
        return null;
    }
}
