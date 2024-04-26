package com.qa.automation.Selenium_Session_2024.CalenderHandling;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender_Handling_1_ {
    

    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        
        driver = new ChromeDriver();
        driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
        Thread.sleep(5000);

        driver.findElement(By.cssSelector("input#datepicker")).click();
     
        FutureMonthDateSelection("July 2024", 31);
       
     
    }

    // Generic Method for selecting a particular date.
    public static void selectDate(int date){
        driver.findElement(By.xpath("//a[text()='"+date+"']")).click();
    }

    
    //Generic Method for Selecting Future date  with corner cases check like(Feb Month, leap year , Days >31 )
    public static void FutureMonthDateSelection(String expMonth_Year, int day){

        //Corner case for Month having 30 days and user passing 31 days
        if(expMonth_Year.equalsIgnoreCase("January") ||
        expMonth_Year.equalsIgnoreCase("March") ||
        expMonth_Year.equalsIgnoreCase("May") ||  
        expMonth_Year.equalsIgnoreCase("July") ||  
        expMonth_Year.equalsIgnoreCase("August") ||  
        expMonth_Year.equalsIgnoreCase("October") ||  
        expMonth_Year.equalsIgnoreCase("December")  && day>30){
            System.out.println("Wrong day passed" +day);
            return;
        }

       

        if(expMonth_Year.equalsIgnoreCase("February") && day >29){
            System.out.println("Wrong day passed" +day);
            return;
        }

        if(day >31){
            System.out.println("Wrong day passed" +day);
            return;
        }

        if(day >1){
            System.out.println("Wrong day passed" +day);
            return;
        }


        String ActualMonthAndYear =driver.findElement(By.cssSelector(".ui-datepicker-title")).getText();

        while(!ActualMonthAndYear.equalsIgnoreCase(expMonth_Year)){
            //click on next button
            driver.findElement(By.xpath("//span[text()='Next']")).click();

            //The ActualMonthAnd Year we need to initialize again bcuz upon clicking next it will again compare the 
            // actual month and year with the future month and year.
            ActualMonthAndYear =driver.findElement(By.cssSelector(".ui-datepicker-title")).getText();

        }

        selectDate(day);
    }

}
