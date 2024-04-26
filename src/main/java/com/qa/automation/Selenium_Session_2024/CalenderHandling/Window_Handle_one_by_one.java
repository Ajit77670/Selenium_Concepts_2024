package com.qa.automation.Selenium_Session_2024.CalenderHandling;

import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handle_one_by_one {
    

    static WebDriver driver;  
    
    public static void main(String[] args) throws InterruptedException {

        driver = new ChromeDriver();
        driver.manage().window().maximize();  
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(3000);

        WebElement lnkdn = driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
        lnkdn.click();

        WebElement fb = driver.findElement(By.xpath("//a[contains(@href,'facebook')]"));
        fb.click();

        WebElement twt = driver.findElement(By.xpath("//a[contains(@href,'twitter')]"));
        twt.click();

        WebElement ytub = driver.findElement(By.xpath("//a[contains(@href,'youtube')]"));
        ytub.click();

        

       //String parentWindow= driver.getWindowHandle();

       Set<String> handles = driver.getWindowHandles();
       Iterator<String> it =handles.iterator();

       String orangeParent =it.next();
       System.out.println("Parent window id" +orangeParent);

       String lnkdnC1 =it.next();
       System.out.println("linkdn window id "+lnkdnC1);

       String fbC2 =it.next();
       System.out.println("facebook window id "+fbC2);

       String twtC3 =it.next();
       System.out.println("twitter window id "+twtC3);

       String ytub4 =it.next();
       System.out.println("youtube window id "+ytub4);


      String title1 = driver.switchTo().window(lnkdnC1).getTitle();
      System.out.println(title1);
      driver.switchTo().window(orangeParent);

      String title2 = driver.switchTo().window(fbC2).getTitle();
      System.out.println(title2);
      driver.switchTo().window(orangeParent);

      String title3 = driver.switchTo().window(twtC3).getTitle();
      System.out.println(title3);
      driver.switchTo().window(orangeParent);

      String title4 = driver.switchTo().window(ytub4).getTitle();
      System.out.println(title4);
      driver.switchTo().window(orangeParent);




     
       
    }

}
