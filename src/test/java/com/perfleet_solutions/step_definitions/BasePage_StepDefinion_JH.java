package com.perfleet_solutions.step_definitions;

import com.perfleet_solutions.pages.BasePage;
import com.perfleet_solutions.utils.Browser;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class BasePage_StepDefinion_JH { BasePage basePage= new BasePage();@Then("should view all modules names :")

public void should_view_eight_modules_names(List<String>ExpectedResults) {
    Browser.sleep(1);
    List<WebElement> ActualResult = basePage.getMainMenu();
       List<String> ActualResultString= new ArrayList<>();
    for (WebElement E:ActualResult
         ) {ActualResultString.add(E.getText());

    }
    Assert.assertEquals(ExpectedResults,ActualResultString);
}


}
