package com.qa.automation.Selenium_Session_2024;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Shadow_DOM_WebElemnt {
    
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
    
        driver = new ChromeDriver();

        driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
        Thread.sleep(3000);

      JavascriptExecutor js = (JavascriptExecutor)driver ;

      WebElement Pizza_Field  = (WebElement)js.executeScript("return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")");
        
      Pizza_Field.sendKeys("Paneer Piza");



      /*------------Note-------------
       * >> For Shadow DOM , we can only interact with the help of JavaScriptExecutor 
       *    there is no direct way in the Selenium to interact with Shadow DOM.
       * 
       * >> First we need to convert the driver into JavaScriptExecutor
       * >> Then right click on webelemnt in the DOM, and copy the JS path.
       * >> Now convert this JS path into WebElemnt and then use the JS actions/methods on Webelement.
       * 
       * 
       * >> This above process is tedious that all the time we need to convert the webelemnt into JS and then use it.
       *    So the Selenium is not considered to be the right choice for Shadow DOM elements.
       */
    }
}
