package memento.game;

import memento.game.careTaker.StateCareTaker;
import memento.game.originator.GameRole;
import org.junit.Test;

public class GameTest {

    @Test
    public void gameTest() {
        GameRole gameRole = new GameRole(200, 100, 50);
        gameRole.show();

        StateCareTaker stateCareTaker = new StateCareTaker();
        stateCareTaker.setStateMemento(gameRole.backupStateMemento());

        gameRole.fight();
        gameRole.show();

        gameRole.recoverStateMemento(stateCareTaker.getStateMemento());
        gameRole.show();
    }

}
