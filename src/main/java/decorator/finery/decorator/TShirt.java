package decorator.finery.decorator;

import decorator.finery.component.Person;
import decorator.finery.decoratorInterface.Finery;

public class TShirt extends Finery {

    public TShirt(Person personWithCloths) {
        super(personWithCloths);
        setName("TShirt");
    }

}
