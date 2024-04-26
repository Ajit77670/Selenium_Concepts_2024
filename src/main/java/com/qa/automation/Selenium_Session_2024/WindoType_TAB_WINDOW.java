package com.qa.automation.Selenium_Session_2024;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindoType_TAB_WINDOW {
    
    public static void main(String[] args) {
        
        WebDriver driver = new ChromeDriver();

       driver.get("https://google.com");
       driver.switchTo().newWindow(WindowType.TAB);
       driver.get("https://amazon.com");

       driver.switchTo().newWindow(WindowType.WINDOW);
       driver.get("https://nike.com");  
    }

}
