package com.perfleet_solutions.pages;

import com.perfleet_solutions.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleOdometerPage {
    public VehicleOdometerPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

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
