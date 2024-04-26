package com.qa.automation.Selenium_Session_2024.Wait_in_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.*;

public class WebDriverWait_With_FluentWaitFeatures {
    
    static WebDriver driver ;
    public static void main(String[] args) {
        

        driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

         By firstName = By.xpath("//input[@id='input-firstname']");

         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
         wait.ignoring(NoAlertPresentException.class);
         wait.ignoring(StaleElementReferenceException.class);
         wait.pollingEvery(Duration.ofSeconds(2));
         wait.withMessage("No such elemnt found");


         wait.until(ExpectedConditions.presenceOfElementLocated(firstName)).sendKeys("Ajit Kumar");

}

}