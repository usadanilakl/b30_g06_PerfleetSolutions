package com.perfleet_solutions.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.perfleet_solutions.utils.Driver.*;

public class TestStepDef {
    @Given("google home page is open")
    public void google_home_page_is_open() throws InterruptedException {
        getDriver().get("https://google.com");
        System.out.println("Opening page " + getDriver().getCurrentUrl());

        Assert.assertEquals("Title doesn't match", "Google", getDriver().getTitle());

    }
    @When("{string} is inputed into google search and enter is pressed")
    public void is_inputed_into_google_search_and_enter_is_pressed(String string) throws InterruptedException {
        System.out.println("Inputting search value " + string);
        getDriver().findElement(By.name("q")).sendKeys(string, Keys.ENTER);

    }
    @Then("google search results are shown for {string}")
    public void google_search_results_are_shown_for(String string) {
        System.out.println("Checking title " + getDriver().getTitle());
        Assert.assertTrue(getDriver().getTitle().contains(string));
    }

}
