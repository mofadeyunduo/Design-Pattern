package strategy.market.strategy;

import strategy.market.strategyInterface.Strategy;

public class DiscountStrategy implements Strategy {

    private Double discount = 1d;

    public DiscountStrategy(Double discount) {
        if(discount < 0 || discount > 1) throw new IllegalArgumentException("discount should between 0 and 1");
        this.discount = discount;
    }

    @Override
    public Double check(Double money) {
        return money * discount;
    }

}
