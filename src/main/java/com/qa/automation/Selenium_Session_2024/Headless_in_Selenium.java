package com.qa.automation.Selenium_Session_2024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless_in_Selenium {
    

    public static void main(String[] args) {
        
        ChromeOptions co = new ChromeOptions();

       co.addArguments("--headless");
       

     WebDriver driver = new ChromeDriver(co); // Pass the ChromeOptions refernce to the ChromeDriver() constaructor

       driver.get("https://www.google.com");
       String title = driver.getTitle();
       System.out.println(title);
       String currenturl = driver.getCurrentUrl();
       System.out.println(currenturl);

    }
}
