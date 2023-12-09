package task.validations;

import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.HomePageUI;
import ui.Login;

public class IsLogOutSucces {
    public static boolean visible(WebDriver webDriver) {
        return WaitUntilElement.isVisible(webDriver, HomePageUI.todoLyLogo);
    }
}
