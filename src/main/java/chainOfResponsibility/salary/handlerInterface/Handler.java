package chainOfResponsibility.salary.handlerInterface;

public abstract class Handler {

    protected Handler next;

    public Handler(Handler next) {
        this.next = next;
    }

    public abstract void handle(int money);

}
