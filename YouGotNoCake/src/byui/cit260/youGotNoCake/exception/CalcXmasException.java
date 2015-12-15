package byui.cit260.youGotNoCake.exception;

public class CalcXmasException extends Exception {
    public CalcXmasException (){
        super ();
    }
    
    public CalcXmasException (String message) {
        super(message);
    }
    
    public CalcXmasException (String message, Throwable cause) {
        super(message, cause);
    }
    
    public CalcXmasException(Throwable cause) {
        super(cause);
    }
}
