package com.qa.automation.Selenium_Session_2024.Pagination;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagination {
    
    static WebDriver driver;    

    public static void main(String[] args) throws InterruptedException {
        
        driver = new ChromeDriver();

        driver.get("https://selectorshub.com/xpath-practice-page/");
        Thread.sleep(3000);

            

         while(true){

            if(driver.findElements(By.xpath("//td[text()='India']")).size()>0){

                    selectMulticountry("India");
                    Thread.sleep(1000);
            }


            WebElement Next = driver.findElement(By.linkText("Next"));
            
               // Corner case check , if country not found we should stop the infinite loop 
               if(Next.getAttribute("class").contains("disabled")){  
                System.out.println("Pagination is over, Country Not found");
                break;
               }

               Next.click();  // if the country not found click on the next page. 
               Thread.sleep(1000);
            }


        }


 
        

        //------------Single checkbox calling process---------
        
        // while(true){  // Taking an infinite loop 

        //     if(driver.findElements(By.xpath("//td[text()='Hong Kong']")).size()>0){ //size>0 means the country is available on the first page itself
        //         // we use findElements here not findElemnt bcuz if the country is not available on the first page it
        //         // will start throwing you exception. so we find the xpath for single elemnt but using findElemnts remember this.
        //         selectconry("Hong Kong");
        //         break; 
        //     }  

        //     //Pagination Logic
        //     else{

        //        WebElement Next = driver.findElement(By.linkText("Next"));
            
        //        // Corner case check , if country not found we should stop the infinite loop 
        //        if(Next.getAttribute("class").contains("disabled")){  

        //         System.out.println("Pagination is over, Country Not found");
        //         break;
        //        }

        //        Next.click();  // if the country not found click on the next page. 
        //     }
        // }



        //Generic Method for multi selection checkbox
    private static void selectMulticountry(String country) throws InterruptedException {
        List<WebElement> list =driver.findElements(By.xpath("//td[text()='"+country+"']/preceding-sibling::td//input[@type='checkbox']"));
         for(WebElement ele :list){
            ele.click();
        }
    }

    
    //Generic Method for Selecting Single Country
    private static void selectconry(String country) {
        driver.findElement(By.xpath("//td[text()='"+country+"']//parent::tr/td/input")).click();
    }


    
}

