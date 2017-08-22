package memento.game.careTaker;

import memento.game.memento.StateMemento;

public class StateCareTaker {

    private StateMemento stateMemento;

    public StateMemento getStateMemento() {
        return stateMemento;
    }

    public void setStateMemento(StateMemento stateMemento) {
        this.stateMemento = stateMemento;
    }

}
