package factory.volunteer.factory;

import factory.volunteer.factoryInterface.IFactory;
import factory.volunteer.product.Undergraduate;
import factory.volunteer.productInterface.LeiFeng;

public class UndergraduateFactory implements IFactory{

    @Override
    public LeiFeng createLeiFeng() {
        return new Undergraduate();
    }

}
