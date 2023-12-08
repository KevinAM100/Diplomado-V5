package task.validations;

import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.Login;
import ui.SignUpFree;

public class LoginSucces {

    public static boolean visible(WebDriver webDriver) {
        return WaitUntilElement.isVisible(webDriver, Login.logOutButton);
    }
}
