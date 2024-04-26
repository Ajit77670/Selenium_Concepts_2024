package com.qa.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class NaveenAutomationCart  {
    
    static WebDriver driver;

    @BeforeTest
    public void setUp(){

        driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
        driver.manage().window().maximize();
    }

    @Test
    public void emailAddressSearchField(){
       boolean flag = driver.findElement(By.cssSelector("#input-email")).isDisplayed();
       Assert.assertTrue(flag);
    }

    @Test
    public void passwordSearchField(){
       boolean flag = driver.findElement(By.cssSelector("#input-password")).isDisplayed();
       Assert.assertTrue(flag);
    }

    @AfterTest
    public void tearDown(){
     driver.quit();
    }
}
