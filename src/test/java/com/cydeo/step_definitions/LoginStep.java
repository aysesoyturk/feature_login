package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStep {

    LoginPage loginPage = new LoginPage();
    WebDriver driver = new ChromeDriver();
    @Given("As a User on the login page of the website")
    public void as_a_user_on_the_login_page_of_the_website() {
        Driver.getDriver().get("https://qa.agileprocrm.com/");
    }
    @When("As an HR user enter {string} as login")
    public void as_an_hr_user_enter_as_login(String login) throws InterruptedException {
        loginPage.loginBox.click();
        loginPage.loginBox.clear();
        Thread.sleep(1000);
        loginPage.loginBox.sendKeys(login);
            }
    @When("As an HR user enter {string} as password")
    public void as_an_hr_user_enter_as_password(String password) {
        loginPage.passwordBox.sendKeys(password);
    }
    @When("As an HR user click on the login button")
    public void as_an_hr_user_click_on_the_login_button() {
       loginPage.loginButton.click();
    }
    @Then("As an HR user, the CRM home page should be displayed")
    public void as_an_hr_user_the_crm_home_page_should_be_displayed() {

        String expectedResultUrl = "https://qa.agileprocrm.com/stream/?login=yes";
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expectedResultUrl));
    }
    @Then("As an HR user should see the error message {string}")
    public void asAnHRUserShouldSeeTheErrorMessage(String message) {
        WebElement errorMessage = driver.findElement(By.xpath("//*[@id=\"login-popup\"]/div[2]/text()"));

        assert(errorMessage.getText().equals(message));

    }
}
