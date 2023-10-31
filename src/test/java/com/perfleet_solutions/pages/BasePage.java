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

    public WebElement getFleetManagementLink() {
        return fleetManagementLink;
    }

    public WebElement getLearnHowToUseThisSpaceLink() {
        return learnHowToUseThisSpaceLink;
    }
}
