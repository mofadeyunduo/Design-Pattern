package bridge.telephone.implementationInterface;

import bridge.telephone.abstractionInterface.Software;

public abstract class Brand {

    protected Software software;

    public Brand(Software software) {
        this.software = software;
    }

    public abstract void run();

}
