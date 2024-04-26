package com.qa.automation.Selenium_Session_2024.Select_Class_DropDown;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


// DropDown without select means , we need to find the xpath and then use driver.findElements.
public class DropDown_without_Select {
    

    public static void main(String[] args) throws InterruptedException {
        
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");

        Thread.sleep(5000);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

       By withoutSelect = By.xpath("//p/select/option");

       List<WebElement> list = driver.findElements(withoutSelect);
       int totalDropdownCount = list.size();
       System.out.println(totalDropdownCount);

    
        for(WebElement ele : list){

          String text =  ele.getText(); 

          System.out.println(text);  
          
          if(text.equals("Albania")){
            ele.click();
            break;  
          }
        }

        

    }




}
