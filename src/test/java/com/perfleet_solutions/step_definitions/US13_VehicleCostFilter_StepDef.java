package com.perfleet_solutions.step_definitions;

import com.perfleet_solutions.pages.AllVehicleCostsPage;
import com.perfleet_solutions.pages.BasePage;
import com.perfleet_solutions.utils.Browser;
import com.perfleet_solutions.utils.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class US13_VehicleCostFilter_StepDef {
    @When("opens Vehicle Costs Page")
    public void opens_vehicle_costs_page() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        WebElement fleet = new BasePage().getFleetLink();
        wait.until(ExpectedConditions.elementToBeClickable(fleet));
        new Actions(Driver.getDriver()).moveToElement(fleet).perform();
        new BasePage().getVehicleCostLink().click();
        Browser.sleep(2);
    }
    @Then("table with the following columns is shown")
    public void table_with_the_following_columns_is_shown(List<String> dataTable) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(new AllVehicleCostsPage().getAllVehiclesTable().get(0)));
        Set<String> actualTableHeaders = new LinkedHashSet<>();
        for(WebElement header : new AllVehicleCostsPage().getAllVehiclesTable()){
            actualTableHeaders.add(header.getText());
        }
        Assert.assertEquals("headers do not match:", dataTable, actualTableHeaders);
    }

    @When("clicks on checkbox next to type colunm")
    public void clicks_on_checkbox_next_to_type_colunm() {
        new AllVehicleCostsPage().getSelectAllCheckBox().click();
        Browser.sleep(2);
        List<WebElement> allCheckboxes = new AllVehicleCostsPage().getAllCheckboxes();
        for(WebElement checkbox : allCheckboxes){
            Assert.assertTrue(checkbox.isSelected());
        }
    }
    @Then("all checkboxes are selected")
    public void all_checkboxes_are_selected() {
        List<WebElement> allCheckboxes = new AllVehicleCostsPage().getAllCheckboxes();
        for(WebElement checkbox : allCheckboxes){
            //Assert.assertTrue(checkbox.isSelected());
        }
        Browser.sleep(2);
    }
    @Then("all checkboxes are deselected")
    public void all_checkboxes_are_deselected() {
        List<WebElement> allCheckboxes = new AllVehicleCostsPage().getAllCheckboxes();
        for (WebElement checkbox : allCheckboxes) {
            Assert.assertFalse(checkbox.isSelected());
        }
        Browser.sleep(2);
    }





}
