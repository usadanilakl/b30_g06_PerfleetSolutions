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
    public WebElement getFleetManagementLink() {
        return fleetManagementLink;
    }

    @FindBy(linkText = "Learn how to use this space")
    private WebElement learnHowToUseThisSpaceLink;
    public WebElement getLearnHowToUseThisSpaceLink() {
        return learnHowToUseThisSpaceLink;
    }

    @FindBy(xpath = "//a[@href='#']/span[contains(text(),'Fleet')]/../..")
    private WebElement fleetLink;
    public WebElement getFleetLink() {
        return fleetLink;
    }

    @FindBy(linkText = "Vehicle Odometer")
    private WebElement vehicleOdometerLink;
    public WebElement getVehicleOdometerLink() {
        return vehicleOdometerLink;
    }

    @FindBy(css="div[data-messenger-namespace='eed2dfc230ad3968235b216c8d8c54588cb2f30904a1c179d4416e09dd8008d3']>div")
    private WebElement youDoNotHavePermissionToPerformThisActionMessage;
    public WebElement getYouDoNotHavePermissionToPerformThisActionMessage() {
        return youDoNotHavePermissionToPerformThisActionMessage;
    }

    @FindBy(xpath = "//a[@href='#']//span[contains(text(),\"Customers\")]")
    private WebElement customersLink;
    public WebElement getCustomersLink() {
        return customersLink;
    }

    @FindBy(xpath = "//a[@href='/account']//span[contains(text(),\"Accounts\")]")
    private WebElement accountsLink;
    public WebElement getAccountsLink() {
        return accountsLink;
    }

    @FindBy(xpath = "//a[@href='/entity/Extend_Entity_VehicleCosts']/span")
    private WebElement vehicleCostLink;
    public WebElement getVehicleCostLink() {
        return vehicleCostLink;
    }

    @FindBy(xpath = "//a[@href='#']/span[contains(text(),\"Marketing\")]")
    private WebElement marketingLink;
    public WebElement getMarketingLink() {
        return marketingLink;
    }

    @FindBy(xpath = "//a[@href='/campaign/']/span[contains(text(),\"Campaigns\")]")
    private WebElement campaignsLink;
    public WebElement getCampaignsLink() {
        return campaignsLink;
    }

    @FindBy(xpath = "//div[@class='loading-bar']")
    private WebElement loadingBar;

    public WebElement getLoadingBar() {
        return loadingBar;
    }
}
