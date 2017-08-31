package chainOfResponsibility.salary;

import chainOfResponsibility.salary.handler.Boss;
import chainOfResponsibility.salary.handler.Manager;
import chainOfResponsibility.salary.handlerInterface.Handler;
import org.junit.Test;

public class SalaryTest {

    @Test
    public void salaryTest() {
        Handler boss = new Boss(null);
        Handler manager = new Manager(boss);

        manager.handle(100);
        System.out.println();
        manager.handle(800);
        System.out.println();
        manager.handle(10000);
        System.out.println();
    }

}
