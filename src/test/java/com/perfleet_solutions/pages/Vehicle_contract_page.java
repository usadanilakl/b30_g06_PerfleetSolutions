package com.perfleet_solutions.pages;

import com.perfleet_solutions.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Vehicle_contract_page extends BasePage{


    @FindBy (xpath = "(//div[@class='message'])[2]")
     public WebElement message;





}
