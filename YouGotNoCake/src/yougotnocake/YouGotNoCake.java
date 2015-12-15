package yougotnocake;

import byui.cit260.youGotNoCake.control.GameControl;
import byui.cit260.youGotNoCake.model.Player;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

public class YouGotNoCake {
    

    private static ObjectOutputStream outFile = null;
    private static ObjectInputStream inFile = null;
    private static PrintWriter logFile = null;
    private static Player player = null;

    public static void main(String[] args){
    
        try {
            //open log file
            logFile = new PrintWriter("log.txt");
            //create Start ProgramView and start the program
            GameControl gameControl = new GameControl();
            gameControl.displayGameMenu();         
            
        } catch (Exception e){
            System.out.println("Exception = " + e.getMessage());
            e.printStackTrace();
            
        } finally {
            try {
                if (logFile != null) {
                    logFile.close();}
            } catch (Exception ex) {
                ex.printStackTrace();
            }           
        }
    }
   
    public static void saveCurrentGame(Player player) {
        //Create the save game data file and store the player object in it
        try {
            FileOutputStream fos = new FileOutputStream("savedGameDataFile");
            outFile = new ObjectOutputStream(fos);
            outFile.writeObject(player);
            outFile.flush();
            outFile.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (outFile != null) {
                try {
                    outFile.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
    
    public static Player startSavedGame(){
        try {
            FileInputStream fis = new FileInputStream("savedGameDataFile");
            inFile = new ObjectInputStream(fis);
            YouGotNoCake.player = (Player)inFile.readObject();
        } catch (Exception ex){
            ex.printStackTrace();
        } finally {
            if (inFile != null) {
                try {
                    inFile.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        } 
        return YouGotNoCake.player;
    }
    
    public static ObjectInputStream getInFile() {
        return inFile;
    }

    public static void setInFile(ObjectInputStream inFile) {
        YouGotNoCake.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        YouGotNoCake.logFile = logFile;
    }
    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        YouGotNoCake.player = player;
    }

    public static ObjectOutputStream getOutFile() {
        return outFile;
    }

    public static void setOutFile(ObjectOutputStream outFile) {
        YouGotNoCake.outFile = outFile;
    }
 }   
    
    

