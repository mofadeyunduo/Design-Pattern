package visitor.people.objectStructure;

import visitor.people.elementInterface.People;
import visitor.people.visitorInterface.Action;

import java.util.ArrayList;
import java.util.List;

public class Structure {

    private List<People> peoples = new ArrayList<>();

    public void addPeople(People people) {
        peoples.add(people);
    }

    public void peopleDoAction(Action action) {
        peoples.forEach(people -> people.doSomething(action));
    }
}
