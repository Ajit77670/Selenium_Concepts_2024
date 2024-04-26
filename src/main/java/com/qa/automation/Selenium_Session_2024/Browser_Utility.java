package com.qa.automation.Selenium_Session_2024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Browser_Utility {
    
private WebDriver driver; 


// Method() for intializing the bRwser 
public WebDriver InitDriver(String browser){

    switch (browser) { 
        
            case "chrome":
            driver = new ChromeDriver();
            break;

            case "edge":
            driver = new EdgeDriver();
            break; 

            case "safari":
            driver = new SafariDriver();
            break; 

            case "firefox":   
            driver = new FirefoxDriver();
            break; 

        default:
        System.out.println("Please choose a compatible Browser for selenium");
        break;
    }

    driver.manage().deleteAllCookies();
    driver.manage().window().maximize();
    return driver;
}


// Method() to launch the Browser.
public String launchUrl (String url){
    driver.get(url);
    return url;
}


//Method() to get the title of the WebPage
public String getTitle(){
   String title = driver.getTitle();
   return title;
}


//Method() for geting currentURL of the page.
   public String getCurrentURL(){
    return driver.getCurrentUrl();
 }
    
    
//Method() for Quiting the Browser
public void QuitBroser(){
    driver.quit();
}

//Method for close the Browser
public void CloseBroser(){
    driver.close();
}







}
