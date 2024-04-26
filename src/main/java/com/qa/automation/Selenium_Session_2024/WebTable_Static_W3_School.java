package com.qa.automation.Selenium_Session_2024;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_Static_W3_School {
    
//Qn : Print the  company names , vertically i.e col wise.
    static WebDriver driver;
    public static void main(String[] args) {

        
        driver = new ChromeDriver(); 

        driver.get("https://www.w3schools.com/html/html_tables.asp");
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

       List<WebElement> list = driver.findElements(By.xpath("//th[text()='Company']/parent::tr/following-sibling::tr/td[1]"));
    
       for(WebElement ele : list){

       String text = ele.getText();

       System.out.println(text);
       }
    }
}
