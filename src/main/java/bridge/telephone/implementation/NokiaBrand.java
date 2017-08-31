package bridge.telephone.implementation;

import bridge.telephone.abstractionInterface.Software;
import bridge.telephone.implementationInterface.Brand;

public class NokiaBrand extends Brand {

    public NokiaBrand(Software software) {
        super(software);
    }

    @Override
    public void run() {
        this.software.run();
    }

}
