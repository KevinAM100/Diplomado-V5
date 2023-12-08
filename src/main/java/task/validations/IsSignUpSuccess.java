package task.validations;

import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.SignUpFree;

public class IsSignUpSuccess {

    public static boolean visible(WebDriver webDriver) {
        return WaitUntilElement.isVisible(webDriver, SignUpFree.logOutButton);
    }

}
