package simpleFactory.operator;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import simpleFactory.operator.factory.OperatorFactory;

import static org.junit.Assert.assertEquals;

public class OperatorFactoryTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void operatorFactory() {
        OperatorFactory operatorFactory = new OperatorFactory();

        Double result = operatorFactory.createOperator("+").opearte(15d, 20d);
        assertEquals((Object)result, 35d);

        result = operatorFactory.createOperator("-").opearte(15d, 20d);
        assertEquals((Object)result, -5d);

        result = operatorFactory.createOperator("*").opearte(15d, 20d);
        assertEquals((Object)result, 300d);

        result = operatorFactory.createOperator("/").opearte(15d, 5d);
        assertEquals((Object)result, 3d);

        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("divide 0");
        result = operatorFactory.createOperator("/").opearte(15d, 0d);

        String operator = "^";
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("operator " + operator + " has not supported");
        result = operatorFactory.createOperator("^").opearte(15d, 0d);
    }

}
