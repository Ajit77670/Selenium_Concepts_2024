package com.qa.automation.Selenium_Session_2024.WindowHandle_Pop_Ups;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;

public class Advertisment_Window_PopUp_handle {
    
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        

        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.convertflow.com/campaigns/popup-examples-templates");

       Thread.sleep(5000);

       String parentWH = driver.getWindowHandle();

       String parentwindow =  driver.getWindowHandle();

       Set<String> handles = driver.getWindowHandles();

       Iterator<String> it = handles.iterator();

         while(it.hasNext()){

            String winID =it.next();
            System.out.println(winID);
          }

    //   List<String> al = new ArrayList<>(handles); 

    //     for(String ele : al){

    //         if(!ele.equals(parentwindow)){

    //             Thread.sleep(3000);
    //                 driver.switchTo().window(ele).close();
    //         }
    //     }

   

    }
}
