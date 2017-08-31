package bridge.telephone.abstraction;

import bridge.telephone.abstractionInterface.Software;

public class Calculator implements Software {

    @Override
    public void run() {
        System.out.println("calculator");
    }

}
