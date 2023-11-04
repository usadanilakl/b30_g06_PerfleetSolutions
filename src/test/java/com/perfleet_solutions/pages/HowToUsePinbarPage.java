package com.perfleet_solutions.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HowToUsePinbarPage extends BasePage{
//    public HowToUsePinbarPage(){
//        super();
//    }
    @FindBy(css="div.clearfix>h3")
    private WebElement howToUsePinbarText;
    @FindBy(css="div.clearfix>p")
    private WebElement insturctionText;
    @FindBy(css="div.clearfix>p>img")
    private WebElement image;

    public WebElement getHowToUsePinbarText() {
        return howToUsePinbarText;
    }

    public WebElement getInsturctionText() {
        return insturctionText;
    }

    public WebElement getImage() {
        return image;
    }
}
