package decorator.finery.decorator;

import decorator.finery.component.Person;
import decorator.finery.decoratorInterface.Finery;

public class Shorts extends Finery {

    public Shorts(Person personWithCloths) {
        super(personWithCloths);
        setName("Shorts");
    }

}
