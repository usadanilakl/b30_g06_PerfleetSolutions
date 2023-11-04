package com.perfleet_solutions.step_definitions;

import com.perfleet_solutions.pages.AllVehicleCostsPage;
import com.perfleet_solutions.utils.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.*;

public class AllVehicleCostFilter_StepDef_DK {
    private AllVehicleCostsPage allVehicleCostsPage = new AllVehicleCostsPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
    @When("clicks on Vehicle Costs Page")
    public void clicks_on_vehicle_costs_page() {
        allVehicleCostsPage.openPage("Fleet", "Vehicle Costs");
    }
    @Then("table with the following columns should be shown")
    public void table_with_the_following_columns_is_shown(List<String> dataTable) {
        List<String> actualTableHeaders = new ArrayList<>();
        wait.until(ExpectedConditions.visibilityOf(new AllVehicleCostsPage().getAllVehiclesTable().get(0)));
        wait.until(ExpectedConditions.invisibilityOf(allVehicleCostsPage.getLoadingBar()));
        for(WebElement header : new AllVehicleCostsPage().getAllVehiclesTable()){
            if(header.getText().length()>0 && !actualTableHeaders.contains(header.getText())){
                actualTableHeaders.add(header.getText());
            }

        }
        for(int i = 0; i<dataTable.size(); i++){
            Assert.assertEquals("headers do not match:", dataTable.get(i), actualTableHeaders.get(i));
        }

    }

    @When("user clicks on checkbox next to type column")
    public void clicks_on_checkbox_next_to_type_colunm() {
        new AllVehicleCostsPage().getSelectAllCheckBox().click();
    }
    @Then("all checkboxes should be selected")
    public void all_checkboxes_are_selected() {
        List<WebElement> allCheckboxes = new AllVehicleCostsPage().getAllCheckboxes();
        for(WebElement checkbox : allCheckboxes){
            Assert.assertTrue(checkbox.isSelected());
        }
    }
    @Then("all checkboxes should be deselected")
    public void all_checkboxes_are_deselected() {
        List<WebElement> allCheckboxes = new AllVehicleCostsPage().getAllCheckboxes();
        for (WebElement checkbox : allCheckboxes) {
            Assert.assertFalse(checkbox.isSelected());
        }
    }
}
