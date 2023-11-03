package com.perfleet_solutions.pages;

import com.perfleet_solutions.utils.ConfigReader;
import com.perfleet_solutions.utils.Driver;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Properties;

import static com.perfleet_solutions.utils.ConfigReader.*;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id="prependedInput")
    private WebElement usernameInput;
    @FindBy(id="prependedInput2")
    private WebElement passwordInput;

    public void loginAsDriver(){
        usernameInput.sendKeys(getProperty("driver_username"));
        passwordInput.sendKeys(getProperty("driver_password"), Keys.ENTER);
    }
    public void loginAsStoreMan(){
        usernameInput.sendKeys(getProperty("store_manager_username"));
        passwordInput.sendKeys(getProperty("store_manager_password"), Keys.ENTER);
    }
    public void loginAsSalesMan(){
        usernameInput.sendKeys(getProperty("sales_manager_username"));
        passwordInput.sendKeys(getProperty("sales_manager_password"), Keys.ENTER);
    }
    public void login(String username, String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password, Keys.ENTER);
    }
    public void login(String user){
        if (user.equals("driver")) loginAsDriver();
        if(user.equals("sales manager")) loginAsSalesMan();
        if(user.equals("store manager")) loginAsStoreMan();
    }

    public void open(){
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }


}
