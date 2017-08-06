package simpleFactory.operator.operator;

import simpleFactory.operator.operatorInterface.Operator;

public class DivideOperator implements Operator {

    public Double opearte(Double left, Double right) {
        if (right == 0) throw new IllegalArgumentException("divide 0");
        else return left / right;
    }
}
