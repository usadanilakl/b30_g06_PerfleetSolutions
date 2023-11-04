package com.perfleet_solutions.step_definitions;

import com.perfleet_solutions.pages.BasePage;
import com.perfleet_solutions.pages.VehicleOdometerPage;
import com.perfleet_solutions.utils.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class VegicleOdometerInfo_StepDef_DK {
    private Actions actions = new Actions(Driver.getDriver());
    private WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
    private VehicleOdometerPage vehicleOdometerPage= new VehicleOdometerPage();
    private BasePage basePage = new BasePage();
    @When("clicks on Vehicle Odometer link")
    public void clicksOnVehicleOdometerLink() {
        vehicleOdometerPage.openPage("Fleet", "Vehicle Odometer");
    }
    @Then("error message is displayed {string}")
    public void error_message_is_displayed(String expecedMessage) {
        String actualMessage = basePage.getYouDoNotHavePermissionToPerformThisActionMessage().getText();
        Assert.assertEquals("message is wrong",expecedMessage,actualMessage);
    }


    @Then("page {int} is selected by default")
    public void pageIsSelectedByDefault(int page) {
        Assert.assertEquals("wrong page is selected",page+"",new VehicleOdometerPage().getPageNumber().getAttribute("value"));
    }

    @And("{int} items are displayed per page")
    public void itemsAreDisplayedPerPage(int items) {
        Assert.assertEquals("worng number of elements per page", items+"", new VehicleOdometerPage().getElementsPerPage().getText());
    }


}

