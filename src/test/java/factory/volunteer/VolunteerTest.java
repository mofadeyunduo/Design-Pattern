package factory.volunteer;

import factory.volunteer.factory.UndergraduateFactory;
import factory.volunteer.factory.VolunteerFactory;
import factory.volunteer.factoryInterface.IFactory;
import factory.volunteer.productInterface.LeiFeng;
import org.junit.Test;

public class VolunteerTest {

    @Test
    public void volunteerTest() {
        IFactory factory = new UndergraduateFactory();
        LeiFeng leiFeng = factory.createLeiFeng();
        leiFeng.sweep();
        leiFeng.wash();
        leiFeng.buyRice();
        System.out.println();

        factory = new VolunteerFactory();
        leiFeng = factory.createLeiFeng();
        leiFeng.sweep();
        leiFeng.wash();
        leiFeng.buyRice();
    }

}
