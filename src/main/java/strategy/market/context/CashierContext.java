package strategy.market.context;

import strategy.market.strategyInterface.Strategy;

public class CashierContext {

    public Strategy strategy;

    public CashierContext(Strategy strategy) {
        this.strategy = strategy;
    }

    public Double squareAccounts(Double money) {
        return strategy.check(money);
    }

}
