package byui.cit260.youGotNoCake.view;

public class HelpMenuView extends View {

    public HelpMenuView() {
        super ("\n"
        +"\n---------------------------------------"
        +"\n    Help Menu"
        +"\n---------------------------------------"
        +"\nG - What is the goal of the game?"
        +"\nM - How to move."
        +"\nC - Items on shopping lists."
        +"\nE - Exit"
        +"\n---------------------------------------");
    }
    @Override
    public boolean doAction(Object obj){
        String value = (String) obj; 
        value = value.toUpperCase(); //convert to all upper case
        char choice = value.charAt(0);
        switch (choice){
            case 'G': //display goal of game
                this.displayGoal();
                break;
            case 'M': //display how to move
                this.displayMove();
                break;
            case 'C': //display items on shopping lists
                this.displayCrossOff();
                break;
            case 'E': //exit help menu to main menu
                MainMenuView mainMenu = new MainMenuView();
                mainMenu.display();
            default:
                System.out.println("\n*** Invalid selection *** Try again.");
        }
        return false;
    }

    private void displayGoal() {
        System.out.println("*\nThe object of the game is to find cake.  You can "
                + "\nget lucky and find cake in two of the 25 locations in the town.  "
                + "\nAutomatic win.  Otherwise, you can win if you find all four "
                + "\nitems on any of the three lists.  Twelve of the 25 locations "
                + "\nhave various items on the player’s shopping lists.  This too "
                + "\nresults in automatically winning the grand cake prize…and your "
                + "\ngame is over. Be careful out there.  You can also get unlucky"
                + "\nand automatially die! The goal of the game is happy, scarey surprises.");
        System.out.println("*\n ****************************************************** *");                       
        }

    private void displayMove() {
        System.out.println("*\nYou play this game by entering input on the screen "
                + "\nand hitting 'Enter'. Follow the prompts to enter menu choices "
                + "\nto go to a new location or cross off items on your shopping "
                + "\nlists.  The program will also ask for player info to make"
                + "\nthree calculations.");

        System.out.println("*\nAlong your way, the game will offer to calculate   "
                + "\nyour BMI, calculate your days until Christmas, and calculate "
                + "\nthe gallons of water your household flushes each day, all based "
                + "\nupon player input.");

        System.out.println("*\n ****************************************************** *"); 
    }

    private void displayCrossOff() {
            System.out.println("*\nAs you are going around town, you figure, why not shop?"
                    + "\nYou are mad about shopping.  You want to find things to make"
                    + "\na cake, things for a birthday party and a variety "
                    + "\nof sleep aids.  You haven’t been sleeping well lately, obviously, "
                    + "\nwaking up in a closet.");
            System.out.println("*\nCake ingredients:" 
                    +"\n1.	Flour" 
                    +"\n2.	Sugar" 
                    +"\n3.	Butta" 
                    +"\n4.	Bananas");

            System.out.println("*\nBirthday party supply list:" 
                    +"\n1.	Whoopie cushion" 
                    +"\n2.	5 gallons of ice cream" 
                    +"\n3.	Grim reaper" 
                    +"\n4.	Plastic forks");

            System.out.println("*\nSleep-aids:" 
                    +"\n1.	Apnea Fairy" 
                    +"\n2.	Tranquilizer dart" 
                    +"\n3.	Tax code" 
                    +"\n4.	Warm milk");}
}