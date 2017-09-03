package facade.fund.facade;

import facade.fund.subFacade.NationalDebt;
import facade.fund.subFacade.Stock;

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
