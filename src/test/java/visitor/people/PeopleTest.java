package visitor.people;

import org.junit.Test;
import visitor.people.element.Man;
import visitor.people.element.Woman;
import visitor.people.objectStructure.Structure;
import visitor.people.visitor.LoveAction;
import visitor.people.visitor.WorkAction;

public class PeopleTest {

    @Test
    public void peopleTest() {
        Structure structure = new Structure();
        structure.addPeople(new Man());
        structure.addPeople(new Woman());

        structure.peopleDoAction(new LoveAction());
        structure.peopleDoAction(new WorkAction());
    }

}
