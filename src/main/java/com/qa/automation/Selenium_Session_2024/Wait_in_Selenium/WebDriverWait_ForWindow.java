package com.qa.automation.Selenium_Session_2024.Wait_in_Selenium;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.*;

public class WebDriverWait_ForWindow {
    
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        //Thread.sleep(5000);


        WebElement lnkdn = driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
        // lnkdn.click();

        WebElement fb = driver.findElement(By.xpath("//a[contains(@href,'facebook')]"));
//      fb.click();

        WebElement twt = driver.findElement(By.xpath("//a[contains(@href,'twitter')]"));
       // twt.click();

        WebElement ytub = driver.findElement(By.xpath("//a[contains(@href,'youtube')]"));
      //  ytub.click();


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.numberOfWindowsToBe(5));

        wait.until(ExpectedConditions.elementToBeClickable(lnkdn));
        wait.until(ExpectedConditions.elementToBeClickable(fb));
        wait.until(ExpectedConditions.elementToBeClickable(twt));
        wait.until(ExpectedConditions.elementToBeClickable(ytub));
      
      

        
        // String parentWid =driver.getWindowHandle();
        // Set<String> handles =driver.getWindowHandles();
        
        // List<String> list = new ArrayList<>(handles);


        

        }


        //----------------------- Generic Methods for multiple window PopUp------------------------------
            public static void switchToParentWindow(String pwd){

                driver.switchTo().window(pwd);

            }



            public static void closeallWindow(List<String> hlsit ,String pwid){

               for(String ele : hlsit){
                 
                if(!ele.equals(pwid)){

                    driver.switchTo().window(ele).close();

                }

               }
            }

            public static boolean switchToRghtWindow(List<String> hlist ,String Wintitle){

                    for(String ele : hlist){

                     String title =  driver.switchTo().window(ele).getTitle();

                     if(title.contains(Wintitle)){

                        System.out.println("Found the right page");
                     }

                     return true;

                    }

                    return false;
            }



       


}
