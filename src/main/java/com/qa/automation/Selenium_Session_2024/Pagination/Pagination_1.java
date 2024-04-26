package com.qa.automation.Selenium_Session_2024.Pagination;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.*;

public class Pagination_1 {
    
    static WebDriver driver;    

    public static void main(String[] args) throws InterruptedException {
        
        driver = new ChromeDriver();

        driver.get("https://selectorshub.com/xpath-practice-page/");
        Thread.sleep(3000);


      //  multipleCountrySelection("India");

        while(true){

            if(driver.findElements(By.xpath("//td[text()='India']")).size()>0){

                multipleCountrySelection("India");

             }

           //  WebElement nextbtn=driver.findElement(By.cssSelector("a.next"));
             WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
             WebElement nextbtn =  wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("a.next"))));
             if(nextbtn.getAttribute("class").contains("disabled")){

                     System.out.println("country not found pagination over");
                    break;
                }
                        nextbtn.click();
                        
        }

        }

   // ---------------------------Single selection logic------------------------------------
    //     while(true){

    //         // For single element remember here to consider the findElements instead of findElement.
    //       if(driver.findElements(By.xpath("//td[text()='Hong Kong']")).size()>0){ //si>0 , means the webelemnt is available on the page

    //         SelectCountry("Hong Kong");
    //         break;
    //       }

    //       //Pagination logic 
    //       else{ // if the webelemnt is not avilable on page click on next btn.

    //         WebElement nextbtn=driver.findElement(By.cssSelector("a.next"));
    //         //Corner case for breaking the loop if all the next page get over , then get the attibute property from
    //         //the nextbtn weblemnt "disbaled" and break the loop.
    //         if(nextbtn.getAttribute("class").contains("disabled")){

    //             System.out.println("country not found pagination over");
    //             break;
    //         }
    //         nextbtn.click();
    //       }
    //     }
     



//generic Method for selecting single country
public static void SelectCountry(String country){
 driver.findElement(By.xpath("//td[text()='"+country+"']//parent::tr//following-sibling::td/input[@type='checkbox']")).click();;
}


public static void multipleCountrySelection(String country){

    List<WebElement> list=driver.findElements(By.xpath("//td[text()='"+country+"']//parent::tr/td/input[@type='checkbox']"));
    for(WebElement ele :list){
    ele.click();
    }
}

}