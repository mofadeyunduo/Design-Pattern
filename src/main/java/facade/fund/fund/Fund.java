package facade.fund.fund;

import facade.fund.stock.NationalDebt;
import facade.fund.stock.Stock;

public class Fund {

    private Stock stock = new Stock();
    private NationalDebt nationalDebt = new NationalDebt();

    public void buy() {
        stock.buy();
        nationalDebt.buy();
    }

    public void sell() {
        stock.sell();
        nationalDebt.sell();
    }

}
