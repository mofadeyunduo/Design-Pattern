package command.BBQ.invoker;

import command.BBQ.commandInterface.Command;

import java.util.ArrayList;
import java.util.List;

public class Waiter {

    private List<Command> commands = new ArrayList<>();

    public void addCommands(Command command) {
        commands.add(command);
    }

    public void executeAllCommands() {
        commands.forEach(Command::executeCommand);
    }

}
