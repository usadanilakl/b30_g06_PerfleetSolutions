package com.perfleet_solutions.step_definitions;

import com.perfleet_solutions.pages.BasePage;
import com.perfleet_solutions.pages.CustomerAccountsPage;
import com.perfleet_solutions.pages.LoginPage;
import com.perfleet_solutions.utils.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class US12_CustomerFilters_DK_StepDef {
    @When("{string} logs in")
    public void logs_in(String string) {
        new LoginPage().login(string);
    }
    @When("opens Account Page")
    public void opens_account_page() {
        WebElement customers = new BasePage().getCustomersLink();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(customers));
        new Actions(Driver.getDriver()).moveToElement(customers).perform();
        new BasePage().getAccountsLink().click();
    }
    @When("opens filter manager")
    public void opens_filter_manager() {
        new CustomerAccountsPage().getFiltersButton().click();

    }
    @Then("all filters are displayed")
    public void all_filters_are_displayed(List<String> expectedFilters) {
        List<WebElement> allFilters = new CustomerAccountsPage().getAllFilters();
        List<String> allFiltersText = new ArrayList<>();
        for (WebElement allFilter : allFilters) {
            allFiltersText.add(allFilter.getText().replace(": All",""));
        }
        Assert.assertEquals("Filter Lists do not mathc",expectedFilters, allFiltersText);
    }


}
