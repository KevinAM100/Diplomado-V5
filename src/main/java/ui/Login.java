package ui;

import org.openqa.selenium.By;

public class Login {

    public static By loginButton = By.xpath("//*[@id=\"ctl00_MainContent_PanelNotAuth\"]/div[2]/div[1]/div[2]/a/img");

    public static By userEmail = By.id("ctl00_MainContent_LoginControl1_TextBoxEmail");
    public static By password = By.id("ctl00_MainContent_LoginControl1_TextBoxPassword");
    public static By logButton = By.id("ctl00_MainContent_LoginControl1_ButtonLogin");

    public static By logOutButton = By.id("ctl00_HeaderTopControl1_LinkButtonLogout");



}
