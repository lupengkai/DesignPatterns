package chainOfResponsibility;

/**
 * Created by tage on 8/22/16.
 */
public abstract class Handler {
    private Handler nextHandler;


    public void setNext(Handler _handler) {
        this.nextHandler = _handler;
    }

    protected abstract Level getHandlerLevel();

    protected abstract Response echo(Request request);


    public final Response handleMessage(Request request) {
        Response response = null;
        if (this.getHandlerLevel().equals(request.getRequestLevel())) {
            response = this.echo(request);
        } else {
            if (this.nextHandler != null) {
                response = this.nextHandler.handleMessage(request);
            } else {

            }
        }

        return response;
    }

}
