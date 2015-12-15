package byui.cit260.youGotNoCake.view;

import byui.cit260.youGotNoCake.model.CakeIngredients;
import byui.cit260.youGotNoCake.model.PartySupplies;
import byui.cit260.youGotNoCake.model.Player;
import byui.cit260.youGotNoCake.model.SleepAids;

public class CrossOffItemMenuView extends View {
//receive player choice and perform list tasks
    private Player pickUpPlayer;
    
    public CrossOffItemMenuView() {
        super("\n"
                + "-----------------------------------------------------------------------"
                + "\n          List Menu"
                + "\n-----------------------------------------------------------------------"
                + "\n    F - Found!  Cross item off my list."
                + "\n    S - View Sleep Aids List"
                + "\n    P - View Party Supplies List"
                + "\n    C - View Cake Ingredients List"
                + "\n\n  E-Exit"
                + "\n-----------------------------------------------------------------------");
    }

    public CrossOffItemMenuView(Player player) {
        super("\n"
                + "-----------------------------------------------------------------------"
                + "\n          List Menu"
                + "\n-----------------------------------------------------------------------"
                + "\n    F - Cross item off my list."
                + "\n    S - View Sleep Aids List"
                + "\n    P - View Party Supplies List"
                + "\n    C - View Cake Ingredients List"
                + "\n\n  E-Exit"
                + "\n-----------------------------------------------------------------------");
    pickUpPlayer = player;
   
    }
    
    @Override
    public boolean doAction(Object obj) {
        
        String value = (String) obj;
        value = value.toUpperCase(); //convert to all upper case
        char choice = value.charAt(0);
        switch (choice) {
            case 'F': //View Sleep Aids list
                System.out.println("*** Congratulations! The item has been crossed off your list! ***");
                break;
            case 'S': //View Sleep Aids list
                this.viewSAList();
                break;
            case 'P': //View Party Supplies list
                this.viewPSList();
                break;
            case 'C': //View Cake Ingredients list
                this.viewCIList();
                break;
            case 'E': //exit the program
                LocationMenuView locationMenu = new LocationMenuView(pickUpPlayer);
                locationMenu.display(); 
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again.");
        }
        return false;
    }
    
    private void viewSAList() {
        //get the sorted list of Sleep Aid items for the current game
        SleepAids[] salist = new SleepAids[]{
            SleepAids.APNEA_FAIRY,
            SleepAids.TAX_CODE,
            SleepAids.TRANQUILIZER_DART,
            SleepAids.WARM_MILK
        };

        System.out.println("\nList of Sleep Aids -- Item Status");
        System.out.println("\nDescription" + "\t\t" + "Found");
        System.out.println();
        
        // sort ArrayList before processing
        pickUpPlayer.sortSleepAids(pickUpPlayer.getFoundSleepAids());
        //for each Sleep Aids list item
        int counter = 0;
        for (SleepAids saItem : salist) {
            //display the description and the found flag
            System.out.print(saItem +"\t\t");
            
            //use counter to make sure we dont get array-out-of-bounds error
            //when trying to print a list with fewer items than the reference list
            if (counter < pickUpPlayer.getFoundSleepAids().size()) { 
                System.out.print(pickUpPlayer.getFoundSleepAids().get(counter) + "\n");  
            } else {
                System.out.print("\n");
            }
            
            counter++;
        }
    }

    private void viewPSList() {
        //get the sorted list of Party Supplies items for the current game
        String[] pslist = new PartySupplies().getPartySuppliesArray();

        System.out.println("\nList of Party Supplies -- Item Status");
        System.out.println("\nDescription" + "\t\t" + "Found");
        System.out.println();
        
        //sort ArrayList before processing
        pickUpPlayer.sortPlayerItems(pickUpPlayer.getFoundPartySupplies());
        //for each Party Supply list item
        int counter = 0;
        for (int i = 0; i < pslist.length; i++) {
            //display the description and the found flag
            System.out.print(pslist[i] + "\t\t");
            
            //use counter to make sure we dont get array-out-of-bounds error
            //when trying to print a list with fewer items than the reference list
            if (counter < pickUpPlayer.getFoundPartySupplies().size()) { 
                System.out.print(pickUpPlayer.getFoundPartySupplies().get(counter) + "\n");  
            } else {
                System.out.print(""+"\n");
            }
            
            counter++;
        }
    } 
    private void viewCIList() {
        //get the sorted list of Sleep Aid items for the current game
        String[] cilist = new CakeIngredients().getCakeIngredientsArray();

        System.out.println("\nList of Cake Ingredients -- Item Status");
        System.out.println("\nDescription" + "\t\t" + "Found");
        System.out.println();
        
        //sort the list before displaying
        pickUpPlayer.sortPlayerItems(pickUpPlayer.getFoundCakeIngredients());
        //for each Cake Ingredients list item
        int counter = 0;
        for (String ciItem : cilist) {
            //display the description and the found flag
            System.out.print(ciItem + "\t\t");
            
            //use counter to make sure we dont get array-out-of-bounds error
            //when trying to print a list with fewer items than the reference list
            if (counter < pickUpPlayer.getFoundCakeIngredients().size()) { 
                System.out.print(pickUpPlayer.getFoundCakeIngredients().get(counter) + "\n");  
            } else {
                System.out.print("\n");
            }
            
            counter++;   
        }
    }
}
