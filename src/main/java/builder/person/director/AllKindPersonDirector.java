package builder.person.director;

import builder.person.builderInterface.PersonBuilder;
import builder.person.directorInterface.PersonDirector;

public class AllKindPersonDirector extends PersonDirector {

    public AllKindPersonDirector(PersonBuilder personBuilder) {
        super(personBuilder);
    }

    @Override
    public void buildPerson() {
        personBuilder.buildHead();
        personBuilder.buildNeck();
        personBuilder.buildBody();
        personBuilder.buildArms();
        personBuilder.buildLegs();
        personBuilder.buildFeet();
    }

}
