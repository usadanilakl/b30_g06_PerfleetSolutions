package com.perfleet_solutions.pages;

import com.perfleet_solutions.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(linkText = "Fleet Management")
    private WebElement fleetManagementLink;

    @FindBy(linkText = "Learn how to use this space")
    private WebElement learnHowToUseThisSpaceLink;
    @FindBy(xpath = "//a[@href='#']/span[contains(text(),'Fleet')]/../..")
    private WebElement fleetLink;
    @FindBy(linkText = "Vehicle Odometer")
    private WebElement vehicleOdometerLink;
    @FindBy(css="div[data-messenger-namespace='eed2dfc230ad3968235b216c8d8c54588cb2f30904a1c179d4416e09dd8008d3']>div")
    private WebElement youDoNotHavePermissionToPerformThisActionMessage;
    @FindBy(xpath = "//a[@href='#']//span[contains(text(),\"Customers\")]")
    private WebElement customersLink;
    @FindBy(xpath = "//a[@href='/account']//span[contains(text(),\"Accounts\")]")
    private WebElement accountsLink;

    public WebElement getCustomersLink() {
        return customersLink;
    }

    public WebElement getAccountsLink() {
        return accountsLink;
    }

    public WebElement getYouDoNotHavePermissionToPerformThisActionMessage() {
        return youDoNotHavePermissionToPerformThisActionMessage;
    }

    public WebElement getVehicleOdometerLink() {
        return vehicleOdometerLink;
    }

    public WebElement getFleetLink() {
        return fleetLink;
    }

    public WebElement getFleetManagementLink() {
        return fleetManagementLink;
    }

    public WebElement getLearnHowToUseThisSpaceLink() {
        return learnHowToUseThisSpaceLink;
    }
}
