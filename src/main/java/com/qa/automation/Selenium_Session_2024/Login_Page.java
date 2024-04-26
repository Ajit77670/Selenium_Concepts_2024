package com.qa.automation.Selenium_Session_2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Page {
    
    static WebDriver driver;

    public static void main(String[] args) {
        
        
        driver = new ChromeDriver();

        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

    //-----------------------------------------------
    //1st Way to interact with webeleemnt
    // driver.findElement(By.id("input-email")).sendKeys("ajit77670");
    // driver.findElement(By.id("input-password")).sendKeys("1234567");
        
    //--------------------------------------
    //2nd way to interact with webelement
    //    WebElement email= driver.findElement(By.id("input-email"));
    //    WebElement pwd = driver.findElement(By.id("input-password"));
        
    //     email.sendKeys("ajit123");
    //     pwd.sendKeys("12345");


    //----------------------------------------------
    //3rd Way to interact with webelemnt

    //    By emailid = By.id("input-email");
    //    By pwd = By.id("input-password");

    //    WebElement eId = driver.findElement(emailid);
    //    WebElement pass = driver.findElement(pwd);

    //    eId.sendKeys("ajit");
    //    pass.sendKeys("123455");
    
    //---------------------------------------------------------
    //4th Way to interact with Web Element (locator + generic Method)

    // By emailid = By.id("input-email");
    // By pwd = By.id("input-password");
    // getElement(emailid).sendKeys("ajittttt");
    // getElement(pwd).sendKeys("466474477");

    //-------------------------------------------------------------    
    // 5th Away to interact with webelement: By locator + generic method and action.
    // By emailid = By.id("input-email");
    // By pwd = By.id("input-password");
    // doSendKeys(emailid, "ajit6670");
    // doSendKeys(pwd, "12346");

    //------------------------------------------------------------------
    // 6th Away to interact with webelement: By locator + generic method and action in a Element Class.
    By emailid = By.id("input-email");
    By pwd = By.id("input-password");

    
    Element_Utility ele = new Element_Utility(driver);
    ele.doSendKeys(emailid, "ajit6670");
    ele.doSendKeys(pwd, "12346");

    




    }   

}
