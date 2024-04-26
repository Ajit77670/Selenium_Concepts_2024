package com.qa.automation.Selenium_Session_2024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driver_quit_close {
    

    public static void main(String[] args) {
        
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

         driver.close();
        //invalid session id  --- main point
        //NoSuchSessionException

        driver.quit();
        //NoSuchSessionException
        //Session ID is null   --- main point
        //Using WebDriver after calling quit()?

        driver.get("https://www.google.com/");

        
        
    }
}
