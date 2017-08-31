package chainOfResponsibility.salary.handler;

import chainOfResponsibility.salary.handlerInterface.Handler;

public class Manager extends Handler {

    public Manager(Handler next) {
        super(next);
    }

    @Override
    public void handle(int money) {
        if (money < 500) {
            System.out.println("OK");
        } else {
            System.out.println("Let me ask Boss.");
            next.handle(money);
        }
    }

}
