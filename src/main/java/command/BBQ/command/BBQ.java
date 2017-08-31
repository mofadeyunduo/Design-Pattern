package command.BBQ.command;

import command.BBQ.commandInterface.Command;
import command.BBQ.reciever.Chief;

public class BBQ extends Command {

    public BBQ(Chief chief) {
        super(chief);
    }

    @Override
    public void executeCommand() {
        chief.BBQ();
    }

}
