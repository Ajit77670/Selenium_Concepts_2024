package com.qa.automation.Selenium_Session_2024.Locator_Concept_in_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;

public class Relative_Locator {
    
     static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        
        driver = new ChromeDriver();

        driver.get("https://www.aqi.in/dashboard/canada");

        driver.manage().window().maximize();
        
        Thread.sleep(3000);  

     WebElement baseEle = driver.findElement(By.xpath("(//a[text()='Red Deer, Canada'])[1]"));


     String str1 =driver.findElement(with(By.tagName("p")).toRightOf(baseEle)).getText();
     System.out.println("The right of the base eleemnt "+ str1);

     String str2 =driver.findElement(with(By.tagName("p")).toLeftOf(baseEle)).getText();
     System.out.println("The left of baseelemnt " +str2);

     String str3 =driver.findElement(with(By.xpath("(//a[text()='Brandon, Canada'])[1]")).above(baseEle)).getText();
     System.out.println("The above of base element is " +str3);

     String str4 =driver.findElement(with(By.xpath("(//a[text()='Calgary, Canada'])[1]")).below(baseEle)).getText();
     System.out.println("The below of base element is " +str4);


/*----------Relative Locators------------
 * 1) toLeftOf
 * 2) toRightOf
 * 3) above
 * 4) below
 * 5) near
 */




}

}