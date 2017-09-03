package interpreter.music.interpreter;

import interpreter.music.interpreterInterface.Expression;

public class ScaleExpression extends Expression {

    @Override
    public void execute(String key, String value) {
        System.out.printf("S: %s %s\n", key, value);
    }

}
