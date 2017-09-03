package mediator.unitedNations.colleagueInterface;

import mediator.unitedNations.mediatorInterface.UnitedNations;

public abstract class Nation {

    protected String nationName;
    protected UnitedNations mediator;

    public Nation(String nationName, UnitedNations mediator) {
        this.nationName = nationName;
        this.mediator = mediator;
    }

    public void getMessage(String message) {
        System.out.printf("%s get message: %s", this.nationName, message);
    }

}
