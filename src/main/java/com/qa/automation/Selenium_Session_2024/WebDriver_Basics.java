package com.qa.automation.Selenium_Session_2024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriver_Basics {
    
public static void main(String[] args) throws InterruptedException {
    

    // Browser compatibility 
    String browser = "Chrome";
    WebDriver driver=null;
   
    if(browser.equalsIgnoreCase("chrome")){

        driver = new ChromeDriver();
    }
    else if (browser.equalsIgnoreCase("firefox")) {
        
        driver = new FirefoxDriver();
    }
    else if (browser.equalsIgnoreCase("edge")){
     
        driver = new EdgeDriver();
    }
    else if (browser.equalsIgnoreCase("safari")){
     
        driver = new SafariDriver();
    }
    else {
        System.out.println("Please select the compatibe browser for Selenium");
    }


   // ChromeDriver driver = new ChromeDriver();

   // WebDriver driver = new ChromeDriver();

    driver.get("https://www.google.com");
    driver.manage().window().maximize();
    Thread.sleep(5000);

    String title =driver.getTitle();
    System.out.println(title);
    driver.quit();



    // Validating the title
    if(title.equals("Google")){   

        System.out.println("Valid Title");
    }
    else{
        System.out.println("Invalid title");
    }
}



}
