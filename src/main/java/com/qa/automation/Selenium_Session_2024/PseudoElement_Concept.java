package com.qa.automation.Selenium_Session_2024;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PseudoElement_Concept {
    
    /*--------------PSEUDO Elements-----------------------------------------
     * >> PSEUDO elements are the elemnts whose attribute value are not define in DOM.
     * >> For ex like * as mandatory field in the webpage represented by ::before or ::after
     * >> So in order to fetch these webelement we need to make use of JavaScriptExecutor
     * 
     * >> First go in the DOM console section and write the script using querySelector which is css selector for the 
     *    element ::before or ::after the mandatory field.
     * 
     */

    public static void main(String[] args) {
        

        WebDriver driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

        JavascriptExecutor js = (JavascriptExecutor)driver;
        String script ="return window.getComputedStyle(document.querySelector(\"label[for=input-lastname]\"),'::before').getPropertyValue('content')";

       String value =js.executeScript(script).toString();
       System.out.println(value);
    }
} 