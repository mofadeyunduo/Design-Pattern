package bridge.telephone;

import bridge.telephone.abstraction.Calculator;
import bridge.telephone.abstraction.Game;
import bridge.telephone.abstractionInterface.Software;
import bridge.telephone.implementation.MiBrand;
import bridge.telephone.implementation.NokiaBrand;
import bridge.telephone.implementationInterface.Brand;
import org.junit.Test;

public class TelephoneTest {

    @Test
    public void telephoneTest() {
        Software game = new Game();
        Software calculator = new Calculator();

        Brand nokia = new NokiaBrand(game);
        nokia.run();
        System.out.println();

        Brand mi = new MiBrand(game);
        mi.run();
        System.out.println();

        mi = new MiBrand(calculator);
        mi.run();
        System.out.println();
    }

}
