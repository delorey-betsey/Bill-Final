package byui.cit260.youGotNoCake.control;

import byui.cit260.youGotNoCake.model.Player;

public class WinControl {
    private Player winner;
    
    public WinControl(Player player) {
        winner = player;
    }
   
    public void checkForWin() {
        String winningList = null;
        if (winner.getFoundCakeIngredients().size() == 4){
            winningList = "cake ingredients";
        }
        if (winner.getFoundPartySupplies().size() == 4) {
            winningList = "party supplies";
        }
        if (winner.getFoundSleepAids().size() == 4 ) {
            winningList = "sleep aids";
        }
        if (winningList != null) {
            displayWinMessage(winningList);    
        } 
    }
    
    public void displayWinMessage(String winList) {
        System.out.println("Congratulations " + winner.getName() + ", you collected all items on the " + winList + " list!");
        System.out.println("You WIN !!!!!");
        System.exit(0);
    }
    
}
