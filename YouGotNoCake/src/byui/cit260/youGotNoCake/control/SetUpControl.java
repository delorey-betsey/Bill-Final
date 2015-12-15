package byui.cit260.youGotNoCake.control;

import byui.cit260.youGotNoCake.model.Player;
import static byui.cit260.youGotNoCake.view.StartProgramView.setPlayer;

public class SetUpControl {    

    public static Player createPlayer(String name) {

        if (name == null) {
            return null;
        }
        Player player = new Player();
        player.setName(name);

        setPlayer(player);  //save the player

        return player;
    }
}
  
