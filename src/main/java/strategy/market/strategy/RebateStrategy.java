package strategy.market.strategy;

import strategy.market.strategyInterface.Strategy;

public class RebateStrategy implements Strategy {

    private Double limit;
    private Double rebate;

    public RebateStrategy(Double limit, Double rebate) {
        if (limit < rebate || limit < 0 || rebate < 0)
            throw new IllegalArgumentException("limit < rebate or limit < 0 or rebate < 0");
        this.limit = limit;
        this.rebate = rebate;
    }

    @Override
    public Double check(Double money) {
        if (money > limit) {
            return money - rebate;
        } else {
            return money;
        }
    }

}
