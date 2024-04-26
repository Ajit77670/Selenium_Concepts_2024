package com.qa.automation.Selenium_Session_2024.Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Class_Slider {
    

    static WebDriver driver;
    public static void main(String[] args) {
        
        driver = new ChromeDriver();
        driver.get("https://jqueryui.com/slider/");

        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
        driver.manage().window().maximize();

        WebElement slider =driver.findElement(By.cssSelector("div#slider"));

        int x = slider.getSize().getWidth();  // Find the X cordinate
        System.out.println(x);

       // slider.click();   // normal click will click on the middle of the Webelement.

       Actions act = new Actions(driver);

      // act.moveToElement(slider, (x/2)-100, 0).click().build().perform();  // Move to the right using actions class

       act.moveToElement(slider, -((x/2)-100), 0).click().build().perform();  // Move to the left using actions class


    }
   



}
