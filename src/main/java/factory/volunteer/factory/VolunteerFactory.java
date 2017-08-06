package factory.volunteer.factory;

import factory.volunteer.factoryInterface.IFactory;
import factory.volunteer.product.Volunteer;
import factory.volunteer.productInterface.LeiFeng;

public class VolunteerFactory implements IFactory {

    @Override
    public LeiFeng createLeiFeng() {
        return new Volunteer();
    }

}
