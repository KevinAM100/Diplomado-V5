package ui;

import org.openqa.selenium.By;

public class SignUpFree {

    public static By signUpFree = By.xpath("//*[@id=\"ctl00_MainContent_PanelNotAuth\"]/div[2]/div[1]/div[3]/a/img");
    public static By fullName = By.id("ctl00_MainContent_SignupControl1_TextBoxFullName");
    public static By email = By.id("ctl00_MainContent_SignupControl1_TextBoxEmail");
    public static By password = By.id("ctl00_MainContent_SignupControl1_TextBoxPassword");
    public static By timeZone = By.id("ctl00_MainContent_SignupControl1_DropDownTimezone");

    public static By optionPacific = By.xpath("//*[@id=\"ctl00_MainContent_SignupControl1_DropDownTimezone\"]/option[5]");

    public static By verify = By.id("ctl00_MainContent_SignupControl1_CheckBoxTerms");

    public static By signUpBUtton = By.id("ctl00_MainContent_SignupControl1_ButtonSignup");

    public static By logOutButton = By.id("ctl00_HeaderTopControl1_LinkButtonLogout");

}
