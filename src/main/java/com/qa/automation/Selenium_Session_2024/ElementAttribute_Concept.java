package com.qa.automation.Selenium_Session_2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementAttribute_Concept {
    
    static WebDriver driver;
    public static void main(String[] args) {
        

        Browser_Utility butil = new Browser_Utility();
        String browser ="chrome";
        driver =butil.InitDriver(browser);
        butil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");


    //Normal way of calling and retreving the Attribute of the locators

    //Retreiveig the Place holder for first Name
     String fname1 =driver.findElement(By.name("firstname")).getAttribute("placeholder");
     System.out.println(fname1);

    // Retreiving then 
   String logo = driver.findElement(By.className("img-responsive")).getAttribute("src");
   String title =driver.findElement(By.className("img-responsive")).getAttribute("title");  
   System.out.println(logo + "------------>" +title);


     // Calling the Attribute of locator using Generic Method getElementAttribute().
       By fname =  By.id("input-firstname");

       String ele = getElementAttribute(fname, "placeholder");

       System.out.println(ele); // this will print the Attribute which we are looking with the respective locator.
 }


// method for finding Webelement
public static WebElement getElement(By locator){  
     return  driver.findElement(locator);
 }

 //Generic method for getAttribute from locators
 public static String getElementAttribute(By locator , String attribute){
      return getElement(locator).getAttribute(attribute);
 }


}