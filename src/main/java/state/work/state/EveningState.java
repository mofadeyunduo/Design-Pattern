package state.work.state;

import state.work.context.WorkContext;

public class EveningState implements State {

    @Override
    public void writeProgramme(WorkContext workContext) {
        System.out.println("Good evening!");
        workContext.setCurrent(null);
    }

}
