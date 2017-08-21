package state.work.state;

import state.work.context.WorkContext;

public class MorningState implements State {

    @Override
    public void writeProgramme(WorkContext workContext) {
        System.out.println("Good morning!");
        workContext.setCurrent(new AfternoonState());
    }

}
