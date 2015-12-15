package byui.cit260.youGotNoCake.view;

import java.io.PrintWriter;
import yougotnocake.YouGotNoCake;

public class ErrorView {
    public static void logError (String className, String errorMessage){
        YouGotNoCake.getLogFile().print(
        "\n________________________________________________"
        + "\n - ERROR - " + errorMessage + " occurred in " + className
        + "\n_____________________________________________");
        YouGotNoCake.getLogFile().flush();
    }
}
