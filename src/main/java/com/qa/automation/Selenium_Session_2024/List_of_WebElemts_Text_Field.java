package com.qa.automation.Selenium_Session_2024;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class List_of_WebElemts_Text_Field {
    
    static WebDriver driver;

    public static void main(String[] args) {
        

        Browser_Utility butil = new Browser_Utility();
        String browser ="chrome";
        driver =butil.InitDriver(browser);
        butil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

       By serach_field_tag = By.tagName("input");

       
       List<WebElement> ele = doGetElements(serach_field_tag);  

        System.out.println(ele.size());
    }


    

    public static  List<WebElement> doGetElements(By locator){
        return  driver.findElements(locator);
        }
    
    
}
