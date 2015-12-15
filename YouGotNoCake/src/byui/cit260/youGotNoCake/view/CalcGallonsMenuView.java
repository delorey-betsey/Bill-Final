package byui.cit260.youGotNoCake.view;
import byui.cit260.youGotNoCake.exception.CalcGallonsException;
import java.util.Scanner;

public class CalcGallonsMenuView {
    
    private final String GALLONSCALCULATION = "\n"
        +"\n-------------------------------------------------------------------"
        +"\n          CALCULATE GALLONS FLUSHED PER HOUSEHOUSE PER DAY                      |"
        +"\n-------------------------------------------------------------------"
        +"\nBased on the number of occupants, we will calculate how many"
        +"\ngallons are flushed into waste system by you and your kin.";
    
    public void displayMenu() {
        
        char selection = ' ';
        
        System.out.println(GALLONSCALCULATION);  //display the main menu
        
        int members = 0;
                
        try {
            members = this.getMembers();   //get the user's household number
            double result = this.calcGallons(members);  //calculate gallons flushed based on user input        
            System.out.println("\nYour household waste water in gallons per day from flushing is :     " 
                + result);  //display the calculated gallons"            
            System.out.println ("\nNo wonder it doesn’t smell very good down here.");
        } catch (CalcGallonsException e) {
            System.out.println("There is an error calculating gallons flushed.");
            ErrorView.logError(this.getClass().getName(), e.getMessage());
        } finally {
            System.out.println( "Continue your quest...");  
            System.out.println("\n======================================================================"); 
        }
 }
 
    private static boolean isInteger(String x) throws CalcGallonsException{
        try { 
            Integer.parseInt(x); 
        } catch(NumberFormatException | NullPointerException e) { 
            throw new CalcGallonsException(e.getMessage()); 
        }
        // only got here if we didn't return false
        return true;
    }
    
    private int getMembers() throws CalcGallonsException {

            boolean valid = false;    //indicates if the choice has been retrieved
            String members = null;
            Scanner keyboard = new Scanner(System.in); //keyboard input stream
            
            //prompt for the player's menu selection
            System.out.println(">>> Enter number of people in your household.");

            //get the choice from the keyboard and trim off the blanks

            members = keyboard.nextLine();
            members = members.trim();
            
            //if 'E' the control falls through and returns to Main Menu
            //then checks to validate input is integer
            //then checks for number selection between 1-25
            //if valid, perform doAction
            int m = 0;
            if (members.charAt(0) != 'E'){
                if (isInteger(members)){
                    //this is creating the new integer variable 'location'
                    //and using a prepackaged function of parseInt from the
                    //the available functions in the Integer class
                    //to see the available functions, type 'Integer.' and hit enter.
                    m = Integer.parseInt(members);
                    if (m <= 0 || m >= 51){
                        throw new CalcGallonsException("Invalid number of household members.");
                    } 
                }
            }
            return m;  //return the valid choice    
        }
    
    public double calcGallons(int members){

        double FLUSHES_PER_PERSON = 5;
        double GALLONS_PER_FLUSH = 3.5;
        double result;
        result = members * FLUSHES_PER_PERSON * GALLONS_PER_FLUSH;
        return result;
        }
    }

