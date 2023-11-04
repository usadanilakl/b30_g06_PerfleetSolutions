package com.perfleet_solutions.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Browser {
    public static void sleep(int seconds){
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void moveToWebElement(WebElement element){
        new Actions(Driver.getDriver()).moveToElement(element).perform();
    }
}
