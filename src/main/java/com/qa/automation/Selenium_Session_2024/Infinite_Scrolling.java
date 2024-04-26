package com.qa.automation.Selenium_Session_2024;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Infinite_Scrolling {
    
    static WebDriver driver;

    public static void main(String[] args) {
        
        driver = new ChromeDriver();

        driver.get("https://scrollmagic.io/examples/advanced/infinite_scrolling.html");

        JavascriptExecutor js = (JavascriptExecutor)driver;
        
       long lastHeight = (long)js.executeScript("return document.body.scrollHeight");  // lastheight means all complete height including scrolling

       while(true){

    try {
           List<WebElement> list= driver.findElements(By.cssSelector("div#content .box1"));

            for(WebElement ele :list){


                String color =ele.getCssValue("background-color");

                System.out.println(color);
            }

               long newHeight =(long)js.executeScript(" return document.body.scrollHeight");  // this height will incerease after every scrolling  

               if(lastHeight ==  newHeight){ // if equal means scrolling over

                    break;
               }

               lastHeight = newHeight;  // if not then newheight value assign to lastheight and the loop will continue

       } catch(Exception e){

            e.printStackTrace();
       }finally{

        driver. quit();
       }

    }
}

}