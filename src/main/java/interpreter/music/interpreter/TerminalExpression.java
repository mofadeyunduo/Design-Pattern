package interpreter.music.interpreter;

import interpreter.music.interpreterInterface.Expression;

public class TerminalExpression extends Expression {

    @Override
    public void execute(String key, String value) {
        System.out.printf("T: %s %s\n", key, value);
    }

}
