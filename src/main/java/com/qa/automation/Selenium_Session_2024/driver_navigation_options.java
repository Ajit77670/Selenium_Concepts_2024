package com.qa.automation.Selenium_Session_2024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driver_navigation_options {
    
    public static void main(String[] args) {
        
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        driver.navigate().to("https://www.amazon.com");

        driver.navigate().back();

        driver.navigate().forward();

        driver.navigate().refresh();

        
    }

    /*---------Notes-------------
     * 1) driver.get() and driver.navigate.to() both use to lauch the browser. The main differnce is
     *  with navigate() function will get additional methods like refresh, forward,backward.
     * 
     * 2)driver.navigate().to() fuction internally calling get() method only. 
     */

}
