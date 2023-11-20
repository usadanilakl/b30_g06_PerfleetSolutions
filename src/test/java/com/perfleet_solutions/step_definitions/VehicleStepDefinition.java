package com.perfleet_solutions.step_definitions;

import com.perfleet_solutions.pages.BasePage;
import com.perfleet_solutions.pages.VehiclePage;
import com.perfleet_solutions.pages.main_menu.Menu;
import com.perfleet_solutions.utils.Driver;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class VehicleStepDefinition {

    BasePage basepage = new BasePage();
    VehiclePage vehiclepage = new VehiclePage();
    Actions actions = new Actions(Driver.getDriver());

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

    @When("users open vehicle page")
    public void users_open_vehicle_page() {
        basepage.openPage(Menu.Fleet.vehicles);

    }

    @When("user hover the mouse over the three dots “…”")
    public void user_hover_the_mouse_over_the_dots() {
        wait.until(ExpectedConditions.visibilityOf(vehiclepage.ellipsis));
        actions.moveToElement(vehiclepage.ellipsis);
    }
    @When("see following options")
    public void see_following_options(List<String> expectedOptions) {
        wait.until(ExpectedConditions.visibilityOf(vehiclepage.menu));
        List<WebElement> ellipsisOptions = vehiclepage.ellipsisOptions;
        List<String> actualOptions = new ArrayList<>();

        for (WebElement each : ellipsisOptions) {
            String title = each.getAttribute("title");
            actualOptions.add(title);

        }

        Assert.assertEquals(expectedOptions, actualOptions);


    }
}
