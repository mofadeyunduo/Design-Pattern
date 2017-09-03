package mediator.unitedNations.mediator;

import mediator.unitedNations.colleague.China;
import mediator.unitedNations.colleague.USA;
import mediator.unitedNations.colleagueInterface.Nation;
import mediator.unitedNations.mediatorInterface.UnitedNations;

public class UnitedNationsSecurityCouncil extends UnitedNations {

    private USA usa;
    private China china;

    public USA getUsa() {
        return usa;
    }

    public void setUsa(USA usa) {
        this.usa = usa;
    }

    public China getChina() {
        return china;
    }

    public void setChina(China china) {
        this.china = china;
    }

    @Override
    public void declare(String message, Nation nation) {
        if (nation == usa) {
            china.getMessage(message);
        } else if (nation == china) {
            usa.getMessage(message);
        }
    }

}
