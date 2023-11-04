package com.perfleet_solutions.pages;

import com.perfleet_solutions.utils.Driver;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CustomerAccountsPage extends BasePage{
    @FindBy(xpath = "//a[@title='Filters']")
    private WebElement filtersButton;
    @FindBy(xpath = "//div[@class='btn filter-criteria-selector oro-drop-opener oro-dropdown-toggle filter-default-value']")
    private List<WebElement> allFilters;

    public WebElement getFiltersButton() {
        return filtersButton;
    }

    public List<WebElement> getAllFilters() {
        return allFilters;
    }
}
