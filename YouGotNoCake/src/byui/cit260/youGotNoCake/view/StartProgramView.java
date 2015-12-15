package byui.cit260.youGotNoCake.view;

import byui.cit260.youGotNoCake.model.Game;
import byui.cit260.youGotNoCake.control.SetUpControl;
import byui.cit260.youGotNoCake.model.Player;

import java.util.Scanner;

public class StartProgramView {
    
    private static Game currentGame = null;
    private static Player player = null;
    
//    public StartProgramView() {
//    }
    public void startProgram(){
       
        //Display the banner screen
        this.displayBanner();
        
        //Prompt the player to enter their name. Retrieve the name of the player
        String playersName = this.getPlayersName();
        
        //Create and save the player object
        Player player = SetUpControl.createPlayer(playersName);
        
        //Display a personalized welcome message
        this.displayWelcomeMessage(player);
        
        //Display the Main menu.    
        
        MainMenuView mainMenu = new MainMenuView(player);
        mainMenu.display();
        
    }
    
    public void displayBanner() {
        //Display welcome banner.
        System.out.println(
                  "*******************************************************************"); 
        System.out.println("*          GAME DESCRIPTION AND HOW TO PLAY-- ");
        
        System.out.println("*\n* Imagine you wake up in a closet. When you open"       
                + "\n* the closet door, you find that there was a birthday party,"
                + "\n* but now everyone is gone.  All that remains are limp balloons"
                + "\n* hanging from the rafters, crushed confetti on"
                + "\n* the floor and paper party plates with telltale cake crumbs."
                + "\n* Naturally, you check to see if there is any cake left,"   
                + "\n* but to your displeasure, there is none. " 
        
                + "\n"
                + "\n* Now all you can think about is cake.  You are on"
                + "\n* a mission to find cake.  You are in a house but you know there "
                + "\n* is no cake here.  You discover the house is in some questionable "
                + "\n* neighborhood. You think about how handy a plastic fork and a "
                + "\n* toy bat would be right about now.  And you begin to roam through "
                + "\n* the town, trying to survive your quest to find some cake. "
              
                + "\n"
                +"\n* There will be various twists and turns in the "
                + "\n* neighborhood that looks like any other, but definitely is not. "
                + "\n* You may encounter pretty weird characters. The Big Question is—"
                + "\n* Will you find cake before you meet an untimely end?   You may "
                + "\n* or may not find cake, but you WILL have fun. *");
        
        System.out.println(
            "*******************************************************************"); 
        
    }

    private String getPlayersName() {
         
        boolean valid = false;    //indicates if the name has been retrieved
        String playersName = null;
        Scanner keyboard = new Scanner(System.in); //keyboard input stream
        
        //while a valid name has not been retrieved
        while(!valid) {    
            
            //prompt for the player's name
            System.out.println("\n>>> Enter the player's name below:");
            
            //get the name from the keyboard and trim off the blanks
            playersName = keyboard.nextLine();
            playersName = playersName.trim();
            
            // if the name is invalid (less than two characters in length)
            if (playersName.length() < 2){
                System.out.println("Invalid name - the name must not be blank");
            }else{
                break; //out of the repetition (exit)
            }
        }
    //return the name
    return playersName;     
    }
    
    public void displayWelcomeMessage(Player player) { 
        
        System.out.println(
        "======================================================================");
        
        System.out.println("          Welcome to the game, " + player.getName() + ".");
        
        System.out.println("          We hope you have a lot of fun!");
        
        System.out.println(
       "======================================================================");        
    }
   
    public static Game getCurrentGame(){
        return currentGame;
    }
    public static void setCurrentGame(Game currentGame) {
        StartProgramView.currentGame = currentGame;
    }
    
    public static Player getPlayer(){
        return player;
    }
    public static void setPlayer(Player player){
        StartProgramView.player = player;
    }
}
