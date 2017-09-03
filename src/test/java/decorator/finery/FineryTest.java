package decorator.finery;

import decorator.finery.component.Person;
import decorator.finery.decorator.Sandal;
import decorator.finery.decorator.Shorts;
import decorator.finery.decorator.TShirt;
import org.junit.Test;

public class FineryTest {

    @Test
    public void fineryTest() {
        Person person = new Person("Piers");
        TShirt tShirt = new TShirt(person);
        Shorts shorts = new Shorts(tShirt);
        Sandal sandal = new Sandal(shorts);

        sandal.show();
    }

}
