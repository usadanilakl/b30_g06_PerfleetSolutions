package com.perfleet_solutions.pages;

import com.perfleet_solutions.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Set;

public class AllVehicleCostsPage {
    public AllVehicleCostsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//span[@class='grid-header-cell__label']")
    private List<WebElement> allVehiclesTable;

    public List<WebElement> getAllVehiclesTable() {
        return allVehiclesTable;
    }
    @FindBy(xpath = "//th[@class='select-all-header-cell renderable grid-cell grid-header-cell grid-header-cell-massAction']//input")
    private WebElement selectAllCheckBox;

    public WebElement getSelectAllCheckBox() {
        return selectAllCheckBox;
    }
    @FindBy(xpath = "//tbody//input[@type='checkbox']")
    private List<WebElement> allCheckboxes;

    public List<WebElement> getAllCheckboxes() {
        return allCheckboxes;
    }
}
