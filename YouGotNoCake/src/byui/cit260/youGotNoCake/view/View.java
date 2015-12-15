package byui.cit260.youGotNoCake.view;

import java.util.Scanner;

public abstract class View implements ViewInterface {
    private String promptMessage;
    
    public View(String promptMessage) {
        this.promptMessage = promptMessage;
    }
    
    @Override
    public void display() {
        String value = "";
        boolean done = false;
        
        do {
            System.out.println(this.promptMessage);  //display prompt menu
            value = this.getInput();   //get value end user entered
            done = this.doAction(value);  //do action based on value entered
        } while (!done);
    }

    @Override
    public String getInput(){
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String value = null;

        //while a valid name has not been retrieved
        while (!valid) {
            //get the value entered from the keyboard
            value = keyboard.nextLine();
            value = value.trim();

            if (value.length() < 1) { //blank value entered
                System.out.println("You must enter a value.");
                continue;
            }
            break;
        }
        return value; //return the name
    }

    public String getPromptMessage(){
        return promptMessage;
    }
    public void setPromptMessage(String message){
        this.promptMessage = message;
    }
}