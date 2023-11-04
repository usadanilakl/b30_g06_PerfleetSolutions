package com.perfleet_solutions.pages;

import com.perfleet_solutions.utils.Browser;
import com.perfleet_solutions.utils.Driver;
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

    //penPage method takes 2 arguments:
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
}
