package state.work.context;

import state.work.state.MorningState;
import state.work.state.State;

public class WorkContext {

    private State current;

    public WorkContext() {
        current = new MorningState();
    }

    public State getCurrent() {
        return current;
    }

    public void setCurrent(State current) {
        this.current = current;
    }

    public void writeProgramme() {
        current.writeProgramme(this);
    }

}
