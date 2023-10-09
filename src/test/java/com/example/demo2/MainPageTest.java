package com.example.demo2;


import org.openqa.selenium.Keys;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

public class MainPageTest {
    private WebDriver driver;
    private FirstPage firstPage;
    private MainPage mainPage;
    private SecondPage secondPage;

    void options() {
        driver.manage().window().maximize();
    }
    @BeforeEach
    void setupChromeDriver() {
        //System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        driver = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");


        driver.manage().window().maximize();

        driver.get("https://dusbez5zif8yv.cloudfront.net");

    }


    @Test
    public void start() {
        mainPage = new MainPage(driver);
        mainPage.startButton.click();
        firstPage = new FirstPage(driver);
        firstPage.startButton.click();
        firstPage.startButton.click();
        secondPage = new SecondPage(driver);
        secondPage.namefield.sendKeys("");
        secondPage.namefield.sendKeys(Keys.ENTER);
        secondPage.yes.click();;


    }
}
