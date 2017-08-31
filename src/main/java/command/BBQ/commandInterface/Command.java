package command.BBQ.commandInterface;

import command.BBQ.reciever.Chief;

public abstract class Command {

    protected Chief chief;

    public Command(Chief chief) {
        this.chief = chief;
    }

    public abstract void executeCommand();

}
