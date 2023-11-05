package com.perfleet_solutions.pages;

import com.perfleet_solutions.pages.main_menu.Menu;
import com.perfleet_solutions.utils.Browser;
import com.perfleet_solutions.utils.Driver;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    private WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
    private Actions actions = new Actions(Driver.getDriver());

    @FindBy(linkText = "Learn how to use this space")
    private WebElement learnHowToUseThisSpaceLink;
    public WebElement getLearnHowToUseThisSpaceLink() {
        return learnHowToUseThisSpaceLink;
    }


    @FindBy(css="div[data-messenger-namespace='eed2dfc230ad3968235b216c8d8c54588cb2f30904a1c179d4416e09dd8008d3']>div")
    private WebElement youDoNotHavePermissionToPerformThisActionMessage;
    public WebElement getYouDoNotHavePermissionToPerformThisActionMessage() {
        return youDoNotHavePermissionToPerformThisActionMessage;
    }

    @FindBy(xpath = "//div[@class='loading-bar']")
    private WebElement loadingBar;

    public WebElement getLoadingBar() {
        return loadingBar;
    }

    @FindBy(xpath = "//ul[@class='nav-multilevel main-menu']/li/a/span")
    protected List<WebElement> mainMenu;
    @FindBy(xpath = "//ul[@class='nav-multilevel main-menu']//ul/li/a/span[@class='title title-level-2']")
    protected List<WebElement> dropdownOptions;

    @FindBy(xpath = "//ul[@class='nav-multilevel main-menu']//ul/li//a/span[@class='title title-level-3']")
    private List<WebElement> thirdLevelDropdownOptions;
    @FindBy(xpath = "//ul[@class='nav-multilevel main-menu']//ul/li//a/span[@class='title title-level-4']")
    private List<WebElement> fourthLevelDropdownOptions;

    //OpenPage method takes 2 arguments:
    //   name of the dropdown of the main menu
    //   name of the option of the selected dropdown
    // upon execution of the method the respective page is opened.
    public void openPage(String menuOption, String dropdownOption){
        wait.until(ExpectedConditions.invisibilityOf(loadingBar));
        WebElement moveTo = mainMenu.stream().filter(p->p.getText().equalsIgnoreCase(menuOption)).findFirst().orElse(null);
        actions.moveToElement(moveTo).perform();
        Browser.sleep(1);
        WebElement clickOn = dropdownOptions.stream().filter(p->p.getText().equalsIgnoreCase(dropdownOption)).findFirst().get();
        clickOn.click();
    }
    public void openPage(String menuOption, String dropdownOption, String thirdLevelDropdownOption){
        wait.until(ExpectedConditions.invisibilityOf(loadingBar));
        WebElement moveTo = mainMenu.stream().filter(p->p.getText().equalsIgnoreCase(menuOption)).findFirst().orElse(null);
        actions.moveToElement(moveTo).perform();
        Browser.sleep(1);
        WebElement moveTo2 = dropdownOptions.stream().filter(p->p.getText().equalsIgnoreCase(dropdownOption)).findFirst().get();
        actions.moveToElement(moveTo2).perform();
        Browser.sleep(1);
        WebElement clickOn = thirdLevelDropdownOptions.stream().filter(p->p.getText().equalsIgnoreCase(thirdLevelDropdownOption)).findFirst().get();
        clickOn.click();
    }
    public void openPage(String menuOption, String dropdownOption, String thirdLevelDropdownOption, String fourthLevelDropdownOption){
        wait.until(ExpectedConditions.invisibilityOf(loadingBar));
        WebElement moveTo = mainMenu.stream().filter(p->p.getText().equalsIgnoreCase(menuOption)).findFirst().orElse(null);
        actions.moveToElement(moveTo).perform();
        Browser.sleep(1);
        WebElement moveTo2 = dropdownOptions.stream().filter(p->p.getText().equalsIgnoreCase(dropdownOption)).findFirst().get();
        actions.moveToElement(moveTo2).perform();
        //Browser.sleep(1);
        WebElement moveTo3 = thirdLevelDropdownOptions.stream().filter(p->p.getText().equalsIgnoreCase(thirdLevelDropdownOption)).findFirst().get();
        actions.moveToElement(moveTo3).perform();
        //Browser.sleep(1);
        WebElement clickOn = fourthLevelDropdownOptions.stream().filter(p->p.getText().equalsIgnoreCase(fourthLevelDropdownOption)).findFirst().get();
        clickOn.click();
    }
    public void openPage(String[] path){
        if(path.length==2) openPage(path[0], path[1]);
        if(path.length==3) openPage(path[0], path[1], path[2]);
        if(path.length==4) openPage(path[0], path[1], path[2], path[3]);
    }

}
