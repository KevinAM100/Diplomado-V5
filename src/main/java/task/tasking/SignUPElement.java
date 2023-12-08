package task.tasking;

import Helpers.helper.ScreenShotHelper;
import actions.Click;
import actions.Enter;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import ui.SignUpFree;

public class SignUPElement {

    public static void as(WebDriver webDriver, String name, String emailSend, String password){
        Click.on(webDriver, SignUpFree.signUpFree);
        Enter.text(webDriver, SignUpFree.fullName, name);
        Enter.text(webDriver, SignUpFree.email, emailSend);
        Enter.text(webDriver, SignUpFree.password, password);
        Click.on(webDriver, SignUpFree.timeZone);
        Click.on(webDriver, SignUpFree.optionPacific);
        Click.on(webDriver, SignUpFree.verify);
        Click.on(webDriver, SignUpFree.signUpBUtton);
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(webDriver, Status.INFO, "Sign UP Elements");
    }
}
