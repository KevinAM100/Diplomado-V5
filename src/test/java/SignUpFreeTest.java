import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.LoginElement;
import task.tasking.SignUPElement;
import task.validations.IsSignUpSuccess;
import task.validations.LoginSucces;

public class SignUpFreeTest extends BaseTest {

    @Test
    public void signUp(){
        SignUPElement.as(webDriver, "Kevin Angulo", "kevin1234565678@email.com", "123456");
        Assert.assertTrue(IsSignUpSuccess.visible(webDriver));
    }

    @Test
    public void login(){
        LoginElement.as(webDriver, "kevin1234565678@email.com", "123456");
        Assert.assertTrue(LoginSucces.visible(webDriver));
    }
}
