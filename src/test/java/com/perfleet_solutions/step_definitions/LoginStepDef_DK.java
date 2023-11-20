package com.perfleet_solutions.step_definitions;

import com.perfleet_solutions.pages.LoginPage;
import com.perfleet_solutions.utils.ConfigReader;
import com.perfleet_solutions.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginStepDef_DK {
    @Given("user opens login page")
    public void login_page_is_open() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }
    @When("{string} logs in")
    public void logs_in(String Usertype) {
        new LoginPage().login(Usertype);
    }
}
