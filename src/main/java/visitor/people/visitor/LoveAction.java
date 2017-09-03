package visitor.people.visitor;

import visitor.people.visitorInterface.Action;

public class LoveAction implements Action {

    @Override
    public void whenMan() {
        System.out.println("I want to fuck her.");
    }

    @Override
    public void whenWoman() {
        System.out.println("What does he think?");
    }

}
