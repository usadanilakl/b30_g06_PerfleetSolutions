package com.perfleet_solutions.step_definitions;

import com.perfleet_solutions.pages.BasePage;
import com.perfleet_solutions.pages.LoginPage;
import com.perfleet_solutions.pages.Vehicle_contract_page;
import com.perfleet_solutions.utils.Browser;
import com.perfleet_solutions.utils.ConfigReader;
import com.perfleet_solutions.utils.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US04_AccessTo_Vehicle_contract_page_step_def {


    Vehicle_contract_page  vehicleContractPage = new Vehicle_contract_page();




    @Then("Expected URL: {string}")
    public void expected_url(String expected_URL) {

        String actualURL= Driver.getDriver().getCurrentUrl();
       // String expectedUrl = expected_URL;
        Assert.assertEquals(actualURL,expected_URL);


    }





    @Then("the app  display {string}")
    public void theAppDisplayYouDoNotHavePermissionToPerformThisAction(String expectedMessage) {

        String actualMessage = vehicleContractPage.message.getText();
        Assert.assertEquals(actualMessage,expectedMessage);
    }

    @When("user access the Vehicle contracts page.")
    public void userAccessTheVehicleContractsPage() {

        vehicleContractPage.openPage("Fleet","Vehicle Contracts");



    }


    @And("Expected title: {string}")
    public void expectedTitle(String expected_Title) {
       // Browser.sleep(5);
        String actualTitle = Driver.getDriver().getTitle();
       // String expectedTitle = "All - Vehicle Contract - Entities - System - Car - Entities - System";
        Assert.assertEquals(expected_Title,actualTitle);

    }
}
