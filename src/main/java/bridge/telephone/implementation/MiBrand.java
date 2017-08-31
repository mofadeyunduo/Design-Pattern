package bridge.telephone.implementation;

import bridge.telephone.abstractionInterface.Software;
import bridge.telephone.implementationInterface.Brand;

public class MiBrand extends Brand {

    public MiBrand(Software software) {
        super(software);
    }

    @Override
    public void run() {
        software.run();
    }

}
