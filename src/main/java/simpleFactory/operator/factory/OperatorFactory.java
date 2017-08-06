package simpleFactory.operator.factory;

import simpleFactory.operator.operator.DivideOperator;
import simpleFactory.operator.operator.MinusOperator;
import simpleFactory.operator.operator.MultiplyOperator;
import simpleFactory.operator.operator.PlusOperator;
import simpleFactory.operator.operatorInterface.Operator;

public class OperatorFactory {

    public Operator createOperator(String operator) {
        switch (operator) {
            case "+":
                return new PlusOperator();
            case "-":
                return new MinusOperator();
            case "*":
                return new MultiplyOperator();
            case "/":
                return new DivideOperator();
            default:
                throw new IllegalArgumentException("operator " + operator + " has not supported");
        }
    }

}
