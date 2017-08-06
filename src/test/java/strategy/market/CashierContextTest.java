package strategy.market;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import strategy.market.context.CashierContext;
import strategy.market.strategy.DiscountStrategy;
import strategy.market.strategy.RebateStrategy;

import static org.junit.Assert.assertEquals;

public class CashierContextTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void cashierContext() {
        CashierContext cashierContext = new CashierContext(new DiscountStrategy(0.8d));
        Double actualPayment = cashierContext.squareAccounts(100d);
        assertEquals((Object) actualPayment, 80d);

        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("discount should between 0 and 1");
        cashierContext = new CashierContext(new DiscountStrategy(1.2d));

        cashierContext = new CashierContext(new RebateStrategy(200d, 100d));
        actualPayment = cashierContext.squareAccounts(100d);
        assertEquals((Object) actualPayment, 100d);

        actualPayment = cashierContext.squareAccounts(300d);
        assertEquals((Object) actualPayment, 200d);

        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("limit < rebate or limit < 0 or rebate < 0");
        cashierContext = new CashierContext(new RebateStrategy(200d, 300d));

        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("limit < rebate or limit < 0 or rebate < 0");
        cashierContext = new CashierContext(new RebateStrategy(-200d, 300d));
    }

}
