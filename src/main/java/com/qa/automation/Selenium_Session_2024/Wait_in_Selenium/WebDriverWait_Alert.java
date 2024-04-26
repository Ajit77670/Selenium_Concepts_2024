package com.qa.automation.Selenium_Session_2024.Wait_in_Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebDriverWait_Alert {
    
    static WebDriver driver;
    public static void main(String[] args) {
        
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        By Js_Alert = By.xpath("//button[text()='Click for JS Alert']");
        By Js_Confirm = By.xpath("//button[text()='Click for JS Confirm']");
        By Js_Click = By.xpath("//button[text()='Click for JS Prompt']");

        driver.findElement(Js_Alert).click();
      
        System.out.println(getAlertText(5));
        getAlertAccept(3);
        
    //    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    //    Alert ale = wait.until(ExpectedConditions.alertIsPresent());
    //    String text =ale.getText();
    //    ale.accept();


   

}

//--------------------Generic Methods for WebDriverWait Alerts-------------------------------

    public static Alert WaitForAlertPresence(int timeOut){
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
         return wait.until(ExpectedConditions.alertIsPresent());
     }


    public static String getAlertText(int timeOut){ 
       return  WaitForAlertPresence(timeOut).getText();
    }

    public static void getAlertAccept(int timeOut){ 
          WaitForAlertPresence(timeOut).accept();
     }

     public static void getAlertDismiss(int timeOut){ 
        WaitForAlertPresence(timeOut).dismiss();
     }


}
