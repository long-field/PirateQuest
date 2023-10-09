package com.example.demo2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    @FindBy(css = "[id='start-button']")
    public WebElement startButton;

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
