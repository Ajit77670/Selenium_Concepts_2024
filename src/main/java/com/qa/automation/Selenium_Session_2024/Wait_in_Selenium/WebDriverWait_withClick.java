package com.qa.automation.Selenium_Session_2024.Wait_in_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.*;;

public class WebDriverWait_withClick {
    
    static WebDriver driver;
    public static void main(String[] args) {
        
        driver = new ChromeDriver();
        driver.get("https://www.freshworks.com/");

        By Try_it_Free = By.xpath("(//a[text()='Try it Free'])[1]");
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(Try_it_Free)).click();


    }

//-----------------------Generic Method for WebDriverWait w.r.t click---------------------------
// Return : WebElement

public static void WaitelementToBeClickable(int duration , By locator){
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
    wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
}


public static void ClicWhenReady(int duration , By locator){
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
    wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
}

public static void WaitdoClickwithAction(int duration , By locator){
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
    WebElement ele =wait.until(ExpectedConditions.elementToBeClickable(locator));
    Actions act = new Actions(driver);
    act.click(ele).build().perform();
}

}
