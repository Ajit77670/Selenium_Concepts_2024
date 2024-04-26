package com.qa.automation.Selenium_Session_2024.Wait_in_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Waits_in_Selenium {
    

    static WebDriver driver;
    public static void main(String[] args) {

        driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

        driver.findElement(By.id("input-firstname"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
    }



    /*--------------Waits in Selenium---------------------
     * 
     * >> Waits in Selenium classified into two parts:
     *      1) Static Wait : Static wait means supoose we have used the wait,  Thread.sleep(5000) in our script,
     *         and the webelemnt get loaded and fetch by driver in 2000 miliseconds , then still the driver have
     *         to wait for 3000 i.e 3 more seconds , thats is unnecessary time consuming and for that reason we 
     *         used to avoid static waits in scripts.
     *         :Ex Thread.sleep()--- Which is coming from Thread class of JAVA.
     * 
     * 
     *      2) Dynamic Wait : Dynamic wait further classified into two parts :
     *          
     *              a) implicitlyWait : Implicit wait is the gloabal wait it will applies for all the elemnts
     *                                 so it is recomnended not to use in the script.
     *              b) Explicit Wait : appicable to a specific webelemnt + polling/interval time + non webelemnt 
     *              >> Explicit Wait further divided into two parts 
     *                                  1)FluentWait  is a class which implements the Wait(Interface)
     *                                  2)WbDriverWait   is a class which extends Fluent wait        
     * 
     *    
     *      3)   Heirarchy of Wait Interface in Selenium  :  
     *           WebDriverWait(C)-->FluentWait(C)--->Wait(I) : until();
     * 
     */
}
