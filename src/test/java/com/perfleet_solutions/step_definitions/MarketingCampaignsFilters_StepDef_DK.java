package com.perfleet_solutions.step_definitions;

import com.perfleet_solutions.pages.CampaignsPage;
import com.perfleet_solutions.utils.Browser;
import com.perfleet_solutions.utils.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class MarketingCampaignsFilters_StepDef_DK {
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
    CampaignsPage campaignsPage = new CampaignsPage();
    @When("clicks on Marketing Page")
    public void opens_marketing_page() {
        campaignsPage.openPage("Marketing", "Campaigns");
    }
    @When("clicks Manage Filters dropdown")
    public void clicks_manage_filters_dropdown() {
        campaignsPage.getOpenFiltersButton().click();
        wait.until(ExpectedConditions.invisibilityOf(campaignsPage.getLoadingBar()));
       campaignsPage.getManageFiltersDropdown().click();
    }
    @Then("user sees all five filters selected by default")
    public void sees_all_five_filters_selected_by_default() {
        for(WebElement checkbox : campaignsPage.getAllFilterCheckboxes()){
            Assert.assertTrue(checkbox.isSelected());
        }
    }

    @Then("user can select any amount of checkboxes")
    public void can_select_any_amount_of_checkboxes() {

        List<WebElement> allChecks = campaignsPage.getAllFilterCheckboxes();
        Assert.assertTrue(allChecks.stream().allMatch(p->p.isSelected()));

        for(int i = 0, c = allChecks.size(); i<allChecks.size(); i++){

            int s = new CampaignsPage().selectedCheckboxes();
            Browser.sleep(1);
            wait.until(ExpectedConditions.invisibilityOf(campaignsPage.getLoadingBar()));
            Assert.assertEquals("number of selected boxes is not matching",c,s);
            allChecks.get(i).click();
            wait.until(ExpectedConditions.elementToBeClickable(allChecks.get(i)));
            Assert.assertFalse(allChecks.get(i).isSelected());
            c--;

        }
    }
}
