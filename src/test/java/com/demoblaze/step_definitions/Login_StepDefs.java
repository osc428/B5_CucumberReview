package com.demoblaze.step_definitions;

import com.demoblaze.pages.LoginWindow;
import com.demoblaze.utilities.ConfigurationReader;
import com.demoblaze.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Login_StepDefs {

    LoginWindow loginWindow = new LoginWindow();


    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }
    @When("The user enters valid credentials")
    public void the_user_enters_valid_credentials() {
        loginWindow.login();
    }
    @Then("verify welcome message")
    public void verify_welcome_message() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(Driver.get(), 20);
        wait.until(ExpectedConditions.visibilityOf(loginWindow.welcomeMessage));
        Assert.assertTrue(loginWindow.welcomeMessage.getText().contains(ConfigurationReader.get("username")));
    }

}
