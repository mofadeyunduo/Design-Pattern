package adapter.basketball;

import adapter.basketball.player.ForwardsPlayer;
import adapter.basketball.player.GuardsPlayer;
import adapter.basketball.player.Translator;
import adapter.basketball.playerInterface.Player;
import org.junit.Test;

public class BasketballTest {

    @Test
    public void basketballTest() {
        Player player1 = new ForwardsPlayer("Piers");
        Player player2 = new GuardsPlayer("Fiers");
        Player player3 = new Translator();

        player1.attack();
        player2.attack();
        player3.attack();
        System.out.println();

        player1.defense();
        player2.defense();
        player3.defense();
    }

}
