package decorator.finery.decorator;

import decorator.finery.decoratorInterface.Finery;
import decorator.finery.person.Person;

public class Sandal extends Finery {

    public Sandal(Person personWithCloths) {
        super(personWithCloths);
        setName("Sandal");
    }

}
