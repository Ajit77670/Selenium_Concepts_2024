package com.qa.automation.Selenium_Session_2024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;

public class Selector_Hub_WebTable_Scenario {
    
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        
        driver = new ChromeDriver();

        driver.get("https://selectorshub.com/xpath-practice-page/");
        Thread.sleep(3000);


       //Selecting Denmark checkbox using Relative Locator
       WebElement target = driver.findElement(By.xpath("//td[text()='Denmark']"));
       driver.findElement(with(By.cssSelector(".row-2 td[class=column-1] input")).toLeftOf(target)).click();
    
    
       Clickcheckbox("India");   
    
    } 

    //Generic Method to select specific city checkbox
    public  static void Clickcheckbox(String city){
    driver.findElement(By.xpath("//td[text()='"+city+"']//parent::tr/td/input")).click();
    }
}
