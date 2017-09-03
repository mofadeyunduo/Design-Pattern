package facade.fund;

import facade.fund.facade.Fund;
import org.junit.Test;

public class FundTest {

    @Test
    public void fundTest() {
        Fund fund = new Fund();
        fund.buy();
        fund.sell();
    }

}
