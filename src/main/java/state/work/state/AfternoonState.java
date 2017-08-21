package state.work.state;

import state.work.context.WorkContext;

public class AfternoonState implements State {

    @Override
    public void writeProgramme(WorkContext workContext) {
        System.out.println("Good afternoon!");
        workContext.setCurrent(new EveningState());
    }

}
