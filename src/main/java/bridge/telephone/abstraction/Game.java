package bridge.telephone.abstraction;

import bridge.telephone.abstractionInterface.Software;

public class Game implements Software {

    @Override
    public void run() {
        System.out.println("game");
    }

}
