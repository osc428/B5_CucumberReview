package com.demoblaze.pages;

import com.demoblaze.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginWindow extends BasePage{

    @FindBy(id = "login2")
    public WebElement loginButtonInNavMenu;

    @FindBy(id = "loginusername")
    public WebElement usernameBox;

    @FindBy(id = "loginpassword")
    public WebElement passwordBox;

    @FindBy(css = "[onclick='logIn()']")
    public WebElement loginButtonInLoginWindow;

    @FindBy(id = "nameofuser")
    public WebElement welcomeMessage;

    public void login (){
        loginButtonInNavMenu.click();
        usernameBox.sendKeys(ConfigurationReader.get("username"));
        passwordBox.sendKeys(ConfigurationReader.get("password"));
        loginButtonInLoginWindow.click();
    }

}
