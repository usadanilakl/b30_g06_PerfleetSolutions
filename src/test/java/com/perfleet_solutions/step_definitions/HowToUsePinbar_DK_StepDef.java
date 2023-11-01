package com.perfleet_solutions.step_definitions;

import com.perfleet_solutions.pages.BasePage;
import com.perfleet_solutions.pages.HowToUsePinbarPage;
import com.perfleet_solutions.pages.LoginPage;
import com.perfleet_solutions.utils.ConfigReader;
import com.perfleet_solutions.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class HowToUsePinbar_DK_StepDef {
    @Given("login page is open")
    public void login_page_is_open() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }
    @Given("{string} is logged in")
    public void is_logged_in(String string) {
        switch (string){
            case "driver":
                new LoginPage().loginAsDriver();
                break;
            case "store manager":
                new LoginPage().loginAsStoreMan();
                break;
            case "sales manager":
                new LoginPage().loginAsSalesMan();
                break;
        }
    }
    @When("user click the “Learn how to use this space” link on the homepage, users should see:")
    public void user_click_the_learn_how_to_use_this_space_link_on_the_homepage_users_should_see() {
        new BasePage().getLearnHowToUseThisSpaceLink().click();
        HowToUsePinbarPage howPage = new HowToUsePinbarPage();

        assertEquals("How To Use Pinbar text is wrong","How To Use Pinbar",howPage.getHowToUsePinbarText().getText());

        assertEquals("Use the pin icon on the right top corner of the page to create fast access link in the pinbar. text is wrong","Use the pin icon on the right top corner of the page to create fast access link in the pinbar.",howPage.getInsturctionText().getText());

        assertEquals("image path is wrong", "https://qa.perfleet.com/bundles/oronavigation/images/pinbar-location.jpg", howPage.getImage().getAttribute("src"));
    }

}
