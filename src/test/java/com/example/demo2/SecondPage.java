package com.example.demo2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecondPage {

    @FindBy(css = "[id='nameInput']")
    public WebElement namefield;
    @FindBy(css = "[id='yes']")
    public WebElement yes;
    public SecondPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
