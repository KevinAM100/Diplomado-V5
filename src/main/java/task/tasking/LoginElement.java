package task.tasking;

import Helpers.helper.ScreenShotHelper;
import actions.Click;
import actions.Enter;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import ui.Login;
import ui.SignUpFree;

public class LoginElement {

    public static void as(WebDriver webDriver, String emailSend, String password){
        Click.on(webDriver, Login.loginButton);
        Enter.text(webDriver, Login.userEmail, emailSend);
        Enter.text(webDriver, Login.password, password);
        Click.on(webDriver, Login.logButton);
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(webDriver, Status.INFO, "Sign UP Elements");
    }
}
