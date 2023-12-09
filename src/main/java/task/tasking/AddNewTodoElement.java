package task.tasking;

import Helpers.helper.ScreenShotHelper;
import actions.Click;
import actions.Enter;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import ui.AddNewTodo;
import ui.Login;

public class AddNewTodoElement {

    public static void as(WebDriver webDriver, String homeWork){
        Enter.text(webDriver, AddNewTodo.addNewPro, homeWork);
        Click.on(webDriver, AddNewTodo.addButton);
    }
}
