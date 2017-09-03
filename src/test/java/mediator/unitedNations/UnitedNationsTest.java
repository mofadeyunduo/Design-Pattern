package mediator.unitedNations;

import mediator.unitedNations.colleague.China;
import mediator.unitedNations.colleague.USA;
import mediator.unitedNations.mediator.UnitedNationsSecurityCouncil;
import org.junit.Test;

public class UnitedNationsTest {

    @Test
    public void unitedNationsTest() {
        UnitedNationsSecurityCouncil unitedNations = new UnitedNationsSecurityCouncil();

        USA usa = new USA("USA", unitedNations);
        China china = new China("China", unitedNations);

        unitedNations.setChina(china);
        unitedNations.setUsa(usa);

        unitedNations.declare("Hi", usa);
        System.out.println();

        unitedNations.declare("你好", china);
        System.out.println();
    }

}
