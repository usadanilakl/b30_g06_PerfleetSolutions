package com.perfleet_solutions.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {
    private Driver(){}
    private static InheritableThreadLocal<WebDriver> driver = new InheritableThreadLocal<>();

    public static WebDriver getDriver(){
        if(driver.get()==null){
            switch (ConfigReader.getProperty("browser")){
                case "chrome":
                    driver.set(new ChromeDriver());
                    break;
                case "firefox":
                    driver.set(new FirefoxDriver());
                    break;
                case "edge":
                    driver.set(new EdgeDriver());
                    break;
                case "safari":
                    driver.set(new SafariDriver());
                    break;
                default:
                    throw new RuntimeException("provided browser" + ConfigReader.getProperty("browser")+ "is not supported. Check spelling");
            }
            driver.get().manage().window().maximize();
            driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
        return driver.get();
    }
    public static void terminate(){
        if(driver.get()!=null){
            driver.get().quit();
            driver.remove();
        }
    }
}
