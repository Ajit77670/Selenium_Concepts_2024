package com.qa.automation.Selenium_Session_2024.SVG_element;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SVG_2_FLORIDA {
    
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
    
        driver = new ChromeDriver();
   
        driver.get("https://petdiseasealerts.org/forecast-map#/");
        driver.manage().window().maximize();
        Thread.sleep(5000);

       driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));

      

       List<WebElement> list = 
       driver.findElements(By.xpath("//*[local-name()='svg']//*[name()='g' and @id='regions']//*[name()='path']"));

       Actions act = new Actions(driver);

       for(WebElement ele : list){

        String cityName =ele.getAttribute("name");

        System.out.println(cityName);

        if(cityName.equals("Florida")){

           Thread.sleep(2000);

           int x =ele.getSize().getWidth();
           int y =ele.getSize().getHeight();
           System.out.println(x + ":" + y);

           act.moveToElement(ele, (x/2)-10,0).click().build().perform();
           break;
        }
       }


}
}