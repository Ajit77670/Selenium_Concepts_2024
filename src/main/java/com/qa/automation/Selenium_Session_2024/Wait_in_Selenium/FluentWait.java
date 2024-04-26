package com.qa.automation.Selenium_Session_2024.Wait_in_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;



import java.time.*;


public class FluentWait {
    

    static WebDriver driver ;
    public static void main(String[] args) {
        

        driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

     
       By firstName = By.xpath("//input[@id='input-firstname']");


         Wait<WebDriver> wt = new org.openqa.selenium.support.ui.FluentWait<>(driver)                           
                            .withTimeout(Duration.ofSeconds(10))    
                            .ignoring(NoAlertPresentException.class)
                            .ignoring(StaleElementReferenceException.class)
                            .pollingEvery(Duration.ofSeconds(2))
                            .withMessage("element is not found on the page");


        wt.until(ExpectedConditions.presenceOfElementLocated(firstName)).sendKeys("Ajit");

    }
}
