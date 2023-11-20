package com.perfleet_solutions.pages;

import org.junit.Before;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class VehiclePage extends BasePage{

    @FindBy(xpath = "(//td[@class='action-cell grid-cell grid-body-cell']//div[@class='more-bar-holder']//a[@data-toggle='dropdown'])[1]")
    public WebElement ellipsis;

    @FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu__action-cell launchers-dropdown-menu detach dropdown-menu__floating']//a" )
    public List<WebElement> ellipsisOptions;

    @FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu__action-cell launchers-dropdown-menu detach dropdown-menu__floating']" )
    public WebElement menu;








}
