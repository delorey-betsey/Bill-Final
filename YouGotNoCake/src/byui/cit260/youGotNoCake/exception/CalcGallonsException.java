package byui.cit260.youGotNoCake.exception;

public class CalcGallonsException extends Exception {
    public CalcGallonsException (){
        super ();
    }
    
    public CalcGallonsException (String message) {
        super(message);
    }
    
    public CalcGallonsException (String message, Throwable cause) {
        super(message, cause);
    }
    
    public CalcGallonsException(Throwable cause) {
        super(cause);
    }
}
