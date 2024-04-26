package com.qa.automation.Selenium_Session_2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayed {
    

    public static void main(String[] args) throws InterruptedException {
        
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.freshworks.com/");
        Thread.sleep(5000);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

       By logo = By.xpath("//img[@alt='freshworks-logo']");

       WebElement ele = driver.findElement(logo);

       String srcatt = ele.getAttribute("src");
       System.out.println("The attribute associated with ele is "+srcatt);

    
       if(ele.isDisplayed()){
        System.out.println("PASS");
       }

        
        

    }
   

    

}
