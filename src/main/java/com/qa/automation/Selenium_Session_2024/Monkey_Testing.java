package com.qa.automation.Selenium_Session_2024;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Monkey_Testing {
    
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        
        driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        
       List<WebElement> header = driver.findElements(By.cssSelector("div#nav-xshop a"));
        int total_headet_topsection =header.size();
        System.out.println(total_headet_topsection);

        for(int i=0 ; i<header.size();i++){

         int randomClick = (int)Math.floor(Math.random())*total_headet_topsection; 

           WebElement ele = header.get(randomClick);
           System.out.println(ele.getText());
           ele.click();
           driver.navigate().back();
           Thread.sleep(1500);

           header = driver.findElements(By.cssSelector("div#nav-xshop a"));
           
         
        
        }




    }
}
