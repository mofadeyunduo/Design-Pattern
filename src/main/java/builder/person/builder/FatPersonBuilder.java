package builder.person.builder;

import builder.person.builderInterface.PersonBuilder;

public class FatPersonBuilder extends PersonBuilder {

    @Override
    public void buildHead() {
        System.out.println("Fat person head");
    }

    @Override
    public void buildNeck() {
        System.out.println("Fat person neck");
    }

    @Override
    public void buildBody() {
        System.out.println("Fat person body");
    }

    @Override
    public void buildArms() {
        System.out.println("Fat person arms");
    }

    @Override
    public void buildLegs() {
        System.out.println("Fat person legs");
    }

    @Override
    public void buildFeet() {
        System.out.println("Fat person feet");
    }

}
