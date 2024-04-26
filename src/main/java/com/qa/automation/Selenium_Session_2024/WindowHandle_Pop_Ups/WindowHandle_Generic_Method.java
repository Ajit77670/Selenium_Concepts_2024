package com.qa.automation.Selenium_Session_2024.WindowHandle_Pop_Ups;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle_Generic_Method {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(3000);

        WebElement lnkdn = driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
        lnkdn.click();

        WebElement fb = driver.findElement(By.xpath("//a[contains(@href,'facebook')]"));
        fb.click();

        WebElement twt = driver.findElement(By.xpath("//a[contains(@href,'twitter')]"));
        twt.click();

        WebElement ytub = driver.findElement(By.xpath("//a[contains(@href,'youtube')]"));
        ytub.click();


        //Always find the parentWindow id first so that we can go back to parent window Id at any time.
        String parentwindow =driver.getWindowHandle();
        
        // Remember to handle multiple windows always try to pass the getWindowhadles() of set to ArrayList<>
         Set<String> handles = driver.getWindowHandles();
         List<String> list = new ArrayList<>(handles);
       

       // When we need to print all the child window id , can use iterator and print it.
        Iterator<String> it = handles.iterator();
        while (it.hasNext()) {  
             String windowids = it.next();
            System.out.println("window id are " + windowids); // Prints all window ids.
        }
         


       //1>Calling switchToRightWindow() method to validate if we are on right window or not. 
       if(switchToRightWindow("Facebook", list)){

        System.out.println(driver.getCurrentUrl() + ":"  +driver.getTitle());
       }

       //2>calling CloseAllWindow method after validating the correct page
       CloseAllWindow(list, parentwindow);


       //3>calling switch to parentwindow method after all operation
       switchToParentWindow(parentwindow);

       

    }



    //Generic method to switch to parentWindow
    public static void switchToParentWindow(String parentwindow){
    driver.switchTo().window(parentwindow);
 }


    //Generic method to close all the window
    public static void CloseAllWindow(List<String> hlist , String parentwindow){

            for(String e : hlist){

                if(!e.equals(parentwindow)){  

                    driver.switchTo().window(e).close();
                }
            }
    }


    //Generic function to check we are on particular webPage or not
    public static boolean switchToRightWindow(String windowtitle, List<String> hlist) {

        for (String e : hlist) {

            String title = driver.switchTo().window(e).getTitle();
            if (title.contains(windowtitle)) {

                System.out.println("found the right window");

                return true; 
            }  
        }
        return false;
     }

}
