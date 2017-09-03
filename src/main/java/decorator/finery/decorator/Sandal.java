package decorator.finery.decorator;

import decorator.finery.component.Person;
import decorator.finery.decoratorInterface.Finery;

public class Sandal extends Finery {

    public Sandal(Person personWithCloths) {
        super(personWithCloths);
        setName("Sandal");
    }

}
