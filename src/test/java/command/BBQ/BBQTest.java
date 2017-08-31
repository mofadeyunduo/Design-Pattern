package command.BBQ;

import command.BBQ.command.BBQ;
import command.BBQ.command.Snake;
import command.BBQ.commandInterface.Command;
import command.BBQ.invoker.Waiter;
import command.BBQ.reciever.Chief;
import org.junit.Test;

public class BBQTest {

    @Test
    public void BBQTest() {
        Chief chief = new Chief("Piers");
        Command cmd1 = new BBQ(chief);
        Command cmd2 = new Snake(chief);
        Waiter waiter = new Waiter();

        waiter.addCommands(cmd1);
        waiter.addCommands(cmd2);

        waiter.executeAllCommands();
    }

}
