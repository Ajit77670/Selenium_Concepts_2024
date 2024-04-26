package com.qa.automation.Selenium_Session_2024.Wait_in_Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWait_WebElements {
    
    static WebDriver driver;

    public static void main(String[] args) {
        
        driver = new ChromeDriver();
        driver.get("https://www.freshworks.com/");

        By footer = By.cssSelector("footer ul a");
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> list =wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(footer));
        int total_footer_count =list.size();
        System.out.println(total_footer_count);

        for(WebElement ele :list){

            String text =ele.getText();

            if(text.length() >0){

                System.out.println(text);
            }
            
        }

        }


//--------------------Generic methods of WEbDriverWait w.r.t WebElements-----------------------------
//Return : List<WebElement>

public static List<WebElement> WaitpresenceOfAllElementsLocatedBy(int duration, By locator){
     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
     return  wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
}

public static List<WebElement> WaitvisibilityOfAllElementsLocatedBy(int duration, By locator){
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
    return  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
}



}
