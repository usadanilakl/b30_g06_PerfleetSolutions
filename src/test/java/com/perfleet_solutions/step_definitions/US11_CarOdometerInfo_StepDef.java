package com.perfleet_solutions.step_definitions;

import com.perfleet_solutions.pages.BasePage;
import com.perfleet_solutions.pages.LoginPage;
import com.perfleet_solutions.pages.VehicleOdometerPage;
import com.perfleet_solutions.utils.Browser;
import com.perfleet_solutions.utils.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US11_CarOdometerInfo_StepDef {
    @When("{string} clicks on Vehicle Odometer link")
    public void clicksOnVehicleOdometerLink(String arg0) {
        Actions actions = new Actions(Driver.getDriver());
        new LoginPage().login(arg0);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(new BasePage().getFleetLink()));
        actions.moveToElement(new BasePage().getFleetLink()).perform();
        //actions.moveByOffset(70,48).perform();
        Browser.sleep(1);
        new BasePage().getVehicleOdometerLink().click();


    }
    @Then("error message is displayed")
    public void error_message_is_displayed() {
        String expectedMessage = new BasePage().getYouDoNotHavePermissionToPerformThisActionMessage().getText();
        Assert.assertEquals("message is wrong","You do not have permission to perform this action.",expectedMessage);
    }


    @Then("page {int} is selected by default")
    public void pageIsSelectedByDefault(int arg0) {
        Assert.assertEquals("wrong page is selected",arg0+"",new VehicleOdometerPage().getPageNumber().getAttribute("value"));
    }

    @And("{int} items are displayed per page")
    public void itemsAreDisplayedPerPage(int arg0) {
        Assert.assertEquals("worng number of elements per page", arg0+"", new VehicleOdometerPage().getElementsPerPage().getText());
    }


}

