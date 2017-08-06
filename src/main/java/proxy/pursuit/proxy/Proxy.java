package proxy.pursuit.proxy;

import proxy.pursuit.pursuit.Pursuit;
import proxy.pursuit.pursuit.SchoolGirl;
import proxy.pursuit.pursuitInterface.IGiveGift;

public class Proxy implements IGiveGift {

    private Pursuit gg;

    public Proxy(SchoolGirl schoolGirl) {
        this.gg = new Pursuit(schoolGirl);
    }

    @Override
    public void giveDolls() {
        gg.giveDolls();
    }

    @Override
    public void giveFlowers() {
        gg.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        gg.giveChocolate();
    }

}
