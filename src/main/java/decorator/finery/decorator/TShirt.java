package decorator.finery.decorator;

import decorator.finery.decoratorInterface.Finery;
import decorator.finery.person.Person;

public class TShirt extends Finery {

    public TShirt(Person personWithCloths) {
        super(personWithCloths);
        setName("TShirt");
    }

}
