package com.perfleet_solutions.step_definitions;

import com.perfleet_solutions.pages.BasePage;
import com.perfleet_solutions.pages.HowToUsePinbarPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class HowToUsePinbar_StepDef_DK {
    private BasePage basePage = new BasePage();
    private HowToUsePinbarPage howPage = new HowToUsePinbarPage();
    @When("user click the Learn how to use this space link on the homepage")
    public void user_click_the_learn_how_to_use_this_space_link_on_the_homepage_users_should_see() {
        basePage.getLearnHowToUseThisSpaceLink().click();
    }

    @And("users should see header {string}")
    public void usersShouldSeeHeader(String header) {
        assertEquals("header text is wrong",header ,howPage.getHowToUsePinbarText().getText());
    }

    @And("paragraph {string}")
    public void paragraph(String paragraph) {
        assertEquals("paragraph is wrong",paragraph,howPage.getInsturctionText().getText());
    }

    @And("picture that has the following url {string}")
    public void pictureThatHasTheFollowingUrl(String url) {
        assertEquals("image path is wrong", url, howPage.getImage().getAttribute("src"));
    }
}
