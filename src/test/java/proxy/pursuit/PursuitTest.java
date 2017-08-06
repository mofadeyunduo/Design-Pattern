package proxy.pursuit;

import org.junit.Test;
import proxy.pursuit.proxy.Proxy;
import proxy.pursuit.pursuit.Pursuit;
import proxy.pursuit.pursuit.SchoolGirl;

public class PursuitTest {

    @Test
    public void pursuitTest() {
        SchoolGirl schoolGirl = new SchoolGirl("Fiers");
        Proxy proxy = new Proxy(schoolGirl);
        proxy.giveDolls();
        proxy.giveFlowers();
        proxy.giveChocolate();
    }

}
