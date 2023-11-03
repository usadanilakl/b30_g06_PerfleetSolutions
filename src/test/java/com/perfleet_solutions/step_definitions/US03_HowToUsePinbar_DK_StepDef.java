package com.perfleet_solutions.step_definitions;

import com.perfleet_solutions.pages.BasePage;
import com.perfleet_solutions.pages.HowToUsePinbarPage;
import com.perfleet_solutions.pages.LoginPage;
import com.perfleet_solutions.utils.ConfigReader;
import com.perfleet_solutions.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class US03_HowToUsePinbar_DK_StepDef {
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
    public void user_click_the_learn_how_to_use_this_space_link_on_the_homepage_users_should_see(List<String>expected) {
        new BasePage().getLearnHowToUseThisSpaceLink().click();
        HowToUsePinbarPage howPage = new HowToUsePinbarPage();

        assertEquals("How To Use Pinbar text is wrong",expected.get(0),howPage.getHowToUsePinbarText().getText());

        assertEquals("Use the pin icon on the right top corner of the page to create fast access link in the pinbar. text is wrong",expected.get(1),howPage.getInsturctionText().getText());

        assertEquals("image path is wrong", expected.get(2), howPage.getImage().getAttribute("src"));
    }

}
