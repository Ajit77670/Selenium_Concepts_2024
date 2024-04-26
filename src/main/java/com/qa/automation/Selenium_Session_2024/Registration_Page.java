package com.qa.automation.Selenium_Session_2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Registration_Page {
    
    

    public static void main(String[] args) {
        

        Browser_Utility butil = new Browser_Utility();

        String browser ="chrome";
        WebDriver driver = butil.InitDriver(browser);
        butil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");


        //By locators - WebElemnt

        By firstName = By.id("input-firstname");
        By lastName= By.id("input-lastname");
        By emailId =  By.id("input-email");
        By telephone =By.id("input-telephone");
        By pwd =By.id("input-password");
        By repwd=By.id("input-confirm");


        Element_Utility ele = new Element_Utility(driver);
        ele.doSendKeys(firstName, "ajit");
        ele.doSendKeys(lastName, "kumar");
        ele.doSendKeys(emailId, "ajit77670");
        ele.doSendKeys(telephone, "9046");
        ele.doSendKeys(pwd, "12345");
        ele.doSendKeys(repwd, "12345");


    }

}
