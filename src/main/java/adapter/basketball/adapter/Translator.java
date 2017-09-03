package adapter.basketball.adapter;

import adapter.basketball.adaptee.YaoMing;
import adapter.basketball.target.Player;

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
