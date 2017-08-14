package builder.person;

import builder.person.builder.FatPersonBuilder;
import builder.person.builder.ThinPersonBuilder;
import builder.person.builderInterface.PersonBuilder;
import builder.person.director.AllKindPersonDirector;
import builder.person.directorInterface.PersonDirector;
import org.junit.Test;

public class PersonTest {

    @Test
    public void personTest() {
        PersonBuilder personBuilder = new FatPersonBuilder();
        PersonDirector personDirector = new AllKindPersonDirector(personBuilder);
        personDirector.buildPerson();
        System.out.println();

        personBuilder = new ThinPersonBuilder();
        personDirector = new AllKindPersonDirector(personBuilder);
        personDirector.buildPerson();
    }

}
