package builder.person.directorInterface;

import builder.person.builderInterface.PersonBuilder;

public abstract class PersonDirector {

    protected PersonBuilder personBuilder;

    public PersonDirector(PersonBuilder personBuilder) {
        this.personBuilder = personBuilder;
    }

    public abstract void buildPerson();

}
