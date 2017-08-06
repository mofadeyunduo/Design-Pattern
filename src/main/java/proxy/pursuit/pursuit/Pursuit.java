package proxy.pursuit.pursuit;

import proxy.pursuit.pursuitInterface.IGiveGift;

public class Pursuit implements IGiveGift {

    private SchoolGirl girl;

    public Pursuit(SchoolGirl girl) {
        this.girl = girl;
    }

    @Override
    public void giveDolls() {
        System.out.println(girl.getName() + ", dolls for you");
    }

    @Override
    public void giveFlowers() {
        System.out.println(girl.getName() + ", flowers for you");
    }

    @Override
    public void giveChocolate() {
        System.out.println(girl.getName() + ", chocolate for you");
    }

}
