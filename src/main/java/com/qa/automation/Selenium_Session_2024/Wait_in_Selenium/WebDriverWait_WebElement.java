package com.qa.automation.Selenium_Session_2024.Wait_in_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.internal.util.Durations;

import java.time.Duration;
import java.util.List;

public class WebDriverWait_WebElement {
    
    static WebDriver driver;
    public static void main(String[] args) {
        
        driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

        By First_name = By.cssSelector("#input-firstname");
        By Last_name = By.cssSelector("#input-lastname");

    //     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    //    WebElement ele = wait.until(ExpectedConditions.presenceOfElementLocated(First_name));
    //    ele.sendKeys("Ajit");

    //    wait.until(ExpectedConditions.visibilityOfElementLocated(Last_name)).sendKeys("Kumar");

    WWpresenceOfElementLocated(10, First_name).sendKeys("Ajit");
    WWvisibilityOfElementLocated(10, Last_name).sendKeys("Kumar");
    
    }

//-----------WebDriverWait w.r.t Element-------------------
//Return :WebElement
    /**
     * An expectation for checking that an element is present on the DOM of a page. 
     * This does not necessarily mean that the element is visible.
     * @param durationTime
     * @param locator
     * @return
     */
    public static WebElement  WWpresenceOfElementLocated(int durationTime , By locator){
     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(durationTime));
      return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }


    /**
     * An expectation for checking that an element is present on the DOM of a page and visible. 
     * Visibility means that the element is not only displayed but also has a height and width that is greater than 0.
     * @param durationTime
     * @param locator
     * @return
     */
    public static WebElement  WWvisibilityOfElementLocated(int durationTime , By locator){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(durationTime));
         return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
       }





}
