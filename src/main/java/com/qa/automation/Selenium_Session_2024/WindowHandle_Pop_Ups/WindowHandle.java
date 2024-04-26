package com.qa.automation.Selenium_Session_2024.WindowHandle_Pop_Ups;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions; 

public class WindowHandle {  
    
    static WebDriver driver;    

    public static void main(String[] args) throws InterruptedException { 
        
        driver = new ChromeDriver();
        driver.manage().window().maximize();  
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 
       
        Thread.sleep(3000); 

    // driver.findElement(By.xpath("//a[@title='Accept Cookies' and text()='Accept Cookies']")).click();
         
      
    // If multiple webpage is there always get the parent windowid first, by using windowhandle
     String parentWindow =driver.getWindowHandle();
     System.out.println("parent window id is "  +parentWindow);
    


      WebElement lnkdn =driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
      lnkdn.click();

      WebElement fb = driver.findElement(By.xpath("//a[contains(@href,'facebook')]"));
      fb.click(); 

      WebElement twt = driver.findElement(By.xpath("//a[contains(@href,'twitter')]"));
      twt.click(); 

      WebElement ytub = driver.findElement(By.xpath("//a[contains(@href,'youtube')]"));  
      ytub.click(); 

  
       Set<String> handles =driver.getWindowHandles();
       
       Iterator<String> it = handles.iterator();

      
    while (it.hasNext()) {  
        String winId = it.next();
        driver.switchTo().window(winId);  
        System.out.println(driver.getCurrentUrl()); // this will give u all the currentURL of the multiple page.
        Thread.sleep(5000);
        
         if(!winId.equals(parentWindow)){
            driver.close(); 
          }

       
     }
        driver.switchTo().window(parentWindow);
        System.out.println(driver.getCurrentUrl());




       
        }


      }  
   

