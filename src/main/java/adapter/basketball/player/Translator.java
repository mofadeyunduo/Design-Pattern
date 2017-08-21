package adapter.basketball.player;

import adapter.basketball.playerInterface.Player;

public class Translator extends Player {

    private YaoMing yaoMing = new YaoMing();

    public Translator() {
        super("YaoMing");
    }

    @Override
    public void attack() {
        yaoMing.进攻();
    }

    @Override
    public void defense() {
        yaoMing.防守();
    }

}
