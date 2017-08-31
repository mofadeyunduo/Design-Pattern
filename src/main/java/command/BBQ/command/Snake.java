package command.BBQ.command;

import command.BBQ.commandInterface.Command;
import command.BBQ.reciever.Chief;

public class Snake extends Command {

    public Snake(Chief chief) {
        super(chief);
    }

    @Override
    public void executeCommand() {
        chief.snake();
    }

}
