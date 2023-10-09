package com.example.demo2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// page_url = https://www.jetbrains.com/
public class FirstPage {

    @FindBy(css = "button[tabindex='0']")
    public WebElement startButton;
    @FindBy(css = "button[tabindex='0']")
    public WebElement startButton2;
    public FirstPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
