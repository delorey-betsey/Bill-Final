package byui.cit260.youGotNoCake.exception;

public class CalcBMIException extends Exception {
    public CalcBMIException (){
        super ();
    }
    
    public CalcBMIException (String message) {
        super(message);
    }
    
    public CalcBMIException (String message, Throwable cause) {
        super(message, cause);
    }
    
    public CalcBMIException(Throwable cause) {
        super(cause);
    }
}
