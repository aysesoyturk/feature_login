package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//*[@id=\"login-popup\"]/form/div[1]/div[1]/input")
    public WebElement loginBox;

    @FindBy(xpath = "//*[@id=\"login-popup\"]/form/div[1]/div[2]/input")
    public WebElement passwordBox;

    @FindBy(xpath = "//*[@id=\"login-popup\"]/form/div[2]/input")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"login-popup\"]/div[2]/text()")
    public WebElement errorMessage;

    public void loginAsHR(){
        loginBox.sendKeys(ConfigurationReader.getProperty("hr_username"));
        passwordBox.sendKeys(ConfigurationReader.getProperty("password"));
        loginButton.click();
    }
    public void loginAsHelpDesk(){
        loginBox.sendKeys(ConfigurationReader.getProperty("helpdesk_username"));
        passwordBox.sendKeys(ConfigurationReader.getProperty("password"));
        loginButton.click();
    }
    public void loginAsMarketing(){
        loginBox.sendKeys(ConfigurationReader.getProperty("marketing_username"));
        passwordBox.sendKeys(ConfigurationReader.getProperty("password"));
        loginButton.click();
    }
    public void loginAsNegative(String username,String password){
        loginBox.sendKeys(username);
        passwordBox.sendKeys(password);
        loginButton.click();
    }
}
