import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.LogOutElement;
import task.tasking.LoginElement;
import task.tasking.SignUPElement;
import task.validations.IsLogOutSucces;
import task.validations.IsSignUpSuccess;
import task.validations.LoginSucces;

public class SignUpFreeTest extends BaseTest {

    @Test(priority = 1)
    public void signUp(){
        SignUPElement.as(webDriver, "Kevin Angulo", "kevin12345656789999@email.com", "123456");
        Assert.assertTrue(IsSignUpSuccess.visible(webDriver));
    }

    @Test(priority = 2)
    public void login(){
        LoginElement.as(webDriver, "kevin12345656789999@email.com", "123456");
        Assert.assertTrue(LoginSucces.visible(webDriver));
    }

    @Test(priority = 3)
    public void logOut(){
        LogOutElement.as(webDriver, "kevin12345656789999@email.com", "123456");
        Assert.assertTrue(IsLogOutSucces.visible(webDriver));
    }
}
