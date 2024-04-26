package com.qa.automation.Selenium_Session_2024.SVG_element;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVG_1 {
         
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
    
        driver = new ChromeDriver();
   
        driver.get("https://petdiseasealerts.org/forecast-map#/");
        driver.manage().window().maximize();
        Thread.sleep(5000);


      //*[local-name()='svg' and @id='map-svg']//*[name()='g']//*[name()='g' and @id='regions']//*[name()='path']


      driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));

       List<WebElement> list = 
       driver.findElements(By.xpath("//*[local-name()='svg']//*[name()='g' and @id='regions']//*[name()='path']"));

        for(WebElement ele : list){

           String text = ele.getAttribute("name");
           
           System.out.println(text);


           if(text.contains("Texas")){

            ele.click();
            break;
           }

        }



       // driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));

       List<WebElement> list2= driver.findElements(By.xpath("//*[local-name()='svg']//*[name()='g' and @id='regions']//*[name()='g' and @class='rpath']//*[name()='path']"));

       int total_citi_in_texas=list2.size();



       System.out.println("-----------------------------------------------------");
       System.out.println("The total city in Texas is "  +total_citi_in_texas);

       for(WebElement ele2 : list2){

       String text2= ele2.getAttribute("name");

       System.out.println(text2);
       

       }
    }

}