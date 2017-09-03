package interpreter.music.interpreterInterface;

import interpreter.music.context.PlayerContext;

public abstract class Expression {

    public void interpret(PlayerContext context) {
        if (context.getContext().length() == 0) return;

        String keyValue = context.getContext().substring(0, 4);
        String key = keyValue.substring(0, 1);
        String value = keyValue.substring(2, 3);

        context.setContext(context.getContext().substring(4));
        execute(key, value);
    }

    public abstract void execute(String key, String value);

}
