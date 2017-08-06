package decorator.finery.decorator;

import decorator.finery.decoratorInterface.Finery;
import decorator.finery.person.Person;

public class Shorts extends Finery {

    public Shorts(Person personWithCloths) {
        super(personWithCloths);
        setName("Shorts");
    }

}
