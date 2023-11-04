package com.perfleet_solutions.pages;

import com.perfleet_solutions.utils.Browser;
import com.perfleet_solutions.utils.Driver;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class VehicleOdometerPage extends BasePage{


    @FindBy(css="input[type='number']")
    private WebElement pageNumber;

    @FindBy(xpath = "//div[@class='page-size pull-right form-horizontal']//button[@data-toggle='dropdown']")
    private WebElement elementsPerPage;

    public WebElement getPageNumber() {
        return pageNumber;
    }

    public WebElement getElementsPerPage() {
        return elementsPerPage;
    }

}
