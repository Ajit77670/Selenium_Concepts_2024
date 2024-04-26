package com.qa.automation.Selenium_Session_2024.Wait_in_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.*;

public class WebDriverWait_Page_Title {
    
    static WebDriver driver;
    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");




    //     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    //    if(wait.until(ExpectedConditions.titleIs("Register Account"))){

    //         System.out.println("Test Passed");
    //    }

    
    System.out.println(WaitPageTitle("Register Account"));

}   

//-----------------Generic Method of WebDriverWait : PageTile-------------------


    public static boolean WaitPageTitle(String title){
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
     return  wait.until(ExpectedConditions.titleIs(title));
    }


        public static String WaitPageTitleContainsAndFetch(String title){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
           wait.until(ExpectedConditions.titleContains(title));
           return driver.getTitle();
        }

        public static String WaitPageTitleAndFetch(String titleValue){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.titleIs(titleValue));
              return driver.getTitle(); 
            } 

    


}
