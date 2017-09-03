package visitor.people.visitor;

import visitor.people.visitorInterface.Action;

public class WorkAction implements Action {

    @Override
    public void whenMan() {
        System.out.println("work work work");
    }

    @Override
    public void whenWoman() {
        System.out.println("work work want to go home");
    }

}
