package com.perfleet_solutions.step_definitions;

import com.perfleet_solutions.pages.BasePage;
import com.perfleet_solutions.pages.CampaignsPage;
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
import java.util.List;

public class US14_MarketingFilters {
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
    @When("opens Marketing Page")
    public void opens_marketing_page() {
        WebElement marketingLink = new BasePage().getMarketingLink();
        wait.until(ExpectedConditions.elementToBeClickable(marketingLink));
        new Actions(Driver.getDriver()).moveToElement(marketingLink).perform();
        new BasePage().getCampaignsLink().click();
    }
    @When("clicks Manage Filters dropdown")
    public void clicks_manage_filters_dropdown() {
        new CampaignsPage().getOpenFiltersButton().click();
        wait.until(ExpectedConditions.invisibilityOf(new BasePage().getLoadingBar()));
       new CampaignsPage().getManageFiltersDropdown().click();
    }
    @Then("{string} sees all five filters selected by default")
    public void sees_all_five_filters_selected_by_default(String string) {
        for(WebElement checkbox : new CampaignsPage().getAllFilterCheckboxes()){
            Assert.assertTrue(checkbox.isSelected());
        }
    }

    @Then("{string} can select any amount of checkboxes")
    public void can_select_any_amount_of_checkboxes(String string) {

        List<WebElement> allChecks = new CampaignsPage().getAllFilterCheckboxes();
        Assert.assertTrue(allChecks.stream().allMatch(p->p.isSelected()));

        for(int i = 0, c = allChecks.size(); i<allChecks.size(); i++){

            int s = new CampaignsPage().selectedCheckboxes();
            Browser.sleep(1);
            wait.until(ExpectedConditions.invisibilityOf(new BasePage().getLoadingBar()));
            Assert.assertEquals("number of selected boxes is not matching",c,s);
            allChecks.get(i).click();
            wait.until(ExpectedConditions.elementToBeClickable(allChecks.get(i)));
            Assert.assertFalse(allChecks.get(i).isSelected());
            c--;

        }
    }

    int count(List<WebElement> list){
        int n = 0;
        for (WebElement check : list) {
            if(check.isSelected()) n++;
        }
        return n;
    }

}
