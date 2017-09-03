package interpreter.music;

import interpreter.music.context.PlayerContext;
import interpreter.music.interpreter.ScaleExpression;
import interpreter.music.interpreter.TerminalExpression;
import interpreter.music.interpreterInterface.Expression;
import org.junit.Test;

public class MusicTest {

    @Test
    public void musicTest() {
        PlayerContext playerContext = new PlayerContext("T 1 O 2 P 3 ");

        while (playerContext.getContext().length() != 0) {
            Expression expression = null;
            switch (playerContext.getContext().charAt(0)) {
                case 'T':
                    expression = new TerminalExpression();
                    break;
                default:
                    expression = new ScaleExpression();
                    break;
            }
            expression.interpret(playerContext);
        }
    }

}
