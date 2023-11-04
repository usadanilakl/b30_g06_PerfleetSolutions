package com.perfleet_solutions.step_definitions;

import com.perfleet_solutions.pages.CustomerAccountsPage;
import com.perfleet_solutions.pages.main_menu.Menu;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class CustomerAccounts_StepDef_DK {
    private CustomerAccountsPage customerAccountsPage = new CustomerAccountsPage();

    @When("clicks on Account Page")
    public void clicks_on_account_page() {

        //customerAccountsPage.openPage("Customers", "Accounts");
        customerAccountsPage.openPage(Menu.Customers.accounts);
    }
    @When("clicks on filter manager")
    public void clicks_on_filter_manager() {
        customerAccountsPage.getFiltersButton().click();

    }
    @Then("all filters are displayed")
    public void all_filters_are_displayed(List<String> expectedFilters) {
        List<WebElement> allFilters = new CustomerAccountsPage().getAllFilters();
        List<String> allFiltersText = new ArrayList<>();
        for (WebElement allFilter : allFilters) {
            allFiltersText.add(allFilter.getText().replace(": All",""));
        }
        Assert.assertEquals("Filter Lists do not match",expectedFilters, allFiltersText);
    }


}
