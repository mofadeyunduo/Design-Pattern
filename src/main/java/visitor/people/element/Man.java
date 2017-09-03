package visitor.people.element;

import visitor.people.elementInterface.People;
import visitor.people.visitorInterface.Action;

public class Man extends People {

    @Override
    public void doSomething(Action action) {
        action.whenMan();
    }

}
