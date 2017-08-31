package chainOfResponsibility.salary.handler;

import chainOfResponsibility.salary.handlerInterface.Handler;

public class Boss extends Handler {

    public Boss(Handler next) {
        super(next);
    }

    @Override
    public void handle(int money) {
        if (money < 1000) System.out.println("OK");
        else System.out.println("No");
    }

}
