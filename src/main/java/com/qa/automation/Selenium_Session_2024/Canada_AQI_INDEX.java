package com.qa.automation.Selenium_Session_2024;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Canada_AQI_INDEX {
    
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        
        driver = new ChromeDriver();

        driver.get("https://www.aqi.in/dashboard/canada");

        driver.manage().window().maximize();
        
        Thread.sleep(3000);  


       System.out.println(AQI("Flin Flon, Canada"));

       AqiDetail("Alberta");
  
} 

    //Generic Method for AQI
    public static String AQI(String city){
     return  driver.findElement(By.xpath
      ("(//a[text()='"+city+"']/parent::p/parent::div/following-sibling::div/p[text()][1])[1]")).getText();
     }



     //Generic Method for printing all the details.
     public static void AqiDetail(String country){

        List<WebElement> list =
        driver.findElements(By.xpath("//a[text()='"+country+"']/parent::th/following-sibling::td"));

        for(WebElement ele : list){

            String text =ele.getText();
          

            if(text.length()>0){

                System.out.println(text);
            }

        }
     }
  
}  

