package com.perfleet_solutions.pages;

import com.perfleet_solutions.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CampaignsPage {
    public CampaignsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(linkText = "Manage filters")
    private WebElement manageFiltersDropdown;
    public WebElement getManageFiltersDropdown() {
        return manageFiltersDropdown;
    }

    @FindBy(xpath = "//ul[@class='ui-multiselect-checkboxes ui-helper-reset fixed-li']//input")
    private List<WebElement> allFilterCheckboxes;
    public List<WebElement> getAllFilterCheckboxes() {
        return allFilterCheckboxes;
    }

    @FindBy(css = "a[title='Filters']")
    private WebElement openFiltersButton;
    public WebElement getOpenFiltersButton() {
        return openFiltersButton;
    }

    public int selectedCheckboxes(){
        int n = 0;
        List<WebElement> all = Driver.getDriver().findElements(By.xpath("//ul[@class='ui-multiselect-checkboxes ui-helper-reset fixed-li']//input"));
        for (WebElement checkbox : all){
            if(checkbox.isSelected()) n++;
        }
        return n;
    }
}
