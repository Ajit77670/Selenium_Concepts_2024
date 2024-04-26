package com.qa.automation.Selenium_Session_2024;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

 /*-----------Purpose of JavascriptExecutor Interface-------------------
  * >> The JavaScriptExecutor is an interface which directly interacts with the DOM.
  * >> So sometimes if we are unable to use the normal function/methods of Webdriver we can use JavaScriptExecutor that time.
  *
  */

public class JavaScriptExecutor_Concept {
    

    static WebDriver driver;
    
    public static void main(String[] args) throws InterruptedException {
        
        driver = new ChromeDriver();

        driver.get("https://www.amazon.in");
        Thread.sleep(3000);
        driver.manage().window().maximize();

        JavascriptExecutor jse =  (JavascriptExecutor)driver;
            
        String title = jse.executeScript("return document.title;").toString();
        System.out.println(title);
        

       /*----------------Few JavaScript Console commands to knew----------------
        * 1) document.title                // return the title of the page , but if the page DOM does not have title wriiten under HTML DOM then it will not return the title
        * 2) alert('hi this is alert')    // generate the alert on web page.
        * 3) history.go(0)                // reload the webpage
        * 4) history.go(1)                // forward the webpage
        * 5) history.go(-1)               // backward the webpage
        * 6) document.documentElement.innerText   // gives all the text of the webpage associated with webelements
        */

       



       

    }
}
