package simpleFactory.operator.operator;

import simpleFactory.operator.operatorInterface.Operator;

public class MultiplyOperator implements Operator {

    public Double opearte(Double left, Double right) {
        return left * right;
    }
}
