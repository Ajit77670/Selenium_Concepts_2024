package com.qa.automation.Selenium_Session_2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ISdisplayed_Method_in_Selenium {
    
     static WebDriver driver;
    public static void main(String[] args) {
        
        String browser ="chrome";
        Browser_Utility butil = new Browser_Utility();
        driver = butil.InitDriver(browser);  // Always intialize the driver here.

        butil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
      
        
        By searchBar =By.xpath("//*[@id=\"search\"]/input");
        getElemnt(searchBar).sendKeys("Macbook"); // callin getElement method

     
    By imageLogo =  By.xpath("//*[@id=\"logo\"]/a/img"); // image logo for NaveenAutomation
      if(doISdisplayed(imageLogo)){     // validating if image logo is present then display msg.
        System.out.println("iamge logo present");
      }
      /*----NOTE----EXCEPTION in Case of isDisplayed-----------
       >>if isDisplayed method  not able to find or locate the webElemt there may be two reason either webelemnt removed
         from webpage or locator path is not correct.

       >> In both the cases it will give an Exception, NoSuchElment Exception 
       */

       /*----NOTE----EXCEPTION in Case of WebDriver Not initialized-----------
       >>if We not initialize the driver in class and using it anywhere, then it will throw an exception,
        NullPointer Exception.
       */
       
    }


    public static WebElement  getElemnt(By locator)
    {
     return   driver.findElement(locator);
    }


    //IsDisplayed Method
    public static boolean doISdisplayed(By locator){

       return getElemnt(locator).isDisplayed();

    }


}
