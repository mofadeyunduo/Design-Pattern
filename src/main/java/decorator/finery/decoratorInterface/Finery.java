package decorator.finery.decoratorInterface;

import decorator.finery.person.Person;

public class Finery extends Person {

    private Person personWithCloths;

    public Finery(Person personWithCloths) {
        this.personWithCloths = personWithCloths;
    }

    @Override
    public void show() {
        if (personWithCloths != null) {
            personWithCloths.show();
            System.out.println(getName() + ' ');
        }
    }

}
