package builder.person.builder;

import builder.person.builderInterface.PersonBuilder;

public class ThinPersonBuilder extends PersonBuilder {

    @Override
    public void buildHead() {
        System.out.println("Thin person head");
    }

    @Override
    public void buildNeck() {
        System.out.println("Thin person neck");
    }

    @Override
    public void buildBody() {
        System.out.println("Thin person body");
    }

    @Override
    public void buildArms() {
        System.out.println("Thin person arms");
    }

    @Override
    public void buildLegs() {
        System.out.println("Thin person legs");
    }

    @Override
    public void buildFeet() {
        System.out.println("Thin person feet");
    }

}
