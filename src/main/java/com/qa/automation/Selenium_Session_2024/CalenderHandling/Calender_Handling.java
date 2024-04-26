package com.qa.automation.Selenium_Session_2024.CalenderHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender_Handling {
    
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        
        driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/demo-site/datepicker/");
        Thread.sleep(5000);

        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame.lazyloaded")));
        driver.findElement(By.cssSelector("input#datepicker")).click();

      
      // selectDate(17);

       futureDateSelection("May 2024", 21);

       List<WebElement> list = driver.findElements(By.cssSelector(".ui-datepicker-calendar td:not(.ui-state-disabled)"));

    //    for(WebElement ele :list){

    //     String text =ele.getText();
    //     if(text.contains("15")){
    //         ele.click();
    //         break;
    //     }

    //    }

    }


    //Generic Method for selecting date
    public static void selectDate(int date){

        driver.findElement(By.xpath("//a[text()='"+date+"']")).click();
    }


    //Generic method for selecting futureDate
    public static void futureDateSelection(String MonthDate, int date){

        WebElement actualYearDate = driver.findElement(By.cssSelector("div.ui-datepicker-title"));
        System.out.println(actualYearDate.getText());
 

        while(true){

            if(!actualYearDate.equals(MonthDate)){

                    driver.findElement(By.xpath("//span[text()='Next']")).click();
                    actualYearDate = driver.findElement(By.cssSelector("div.ui-datepicker-title"));//This is the only thing to remmeber to initialize again
                    selectDate(date);
                    break;
            }


        }
    }
}
