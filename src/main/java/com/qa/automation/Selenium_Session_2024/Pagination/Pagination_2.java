package com.qa.automation.Selenium_Session_2024.Pagination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagination_2 {
    

    static WebDriver driver;    

    public static void main(String[] args) throws InterruptedException {
        
        driver = new ChromeDriver();

        driver.get("https://www.ogdivine.com/collections/tshirts-1");
        Thread.sleep(3000);

        while(true){

            //if the elemnt on first page
            if(driver.findElements(By.xpath("(//a[normalize-space()='Ramdoot Hanuman Oversized Tee'])[1]")).size()>0){

                selectProduct("Ramdoot Hanuman Oversized Tee");
                break;
            }
            else{// or else click on next to select the product.
                //Pagination Logic
                WebElement next = driver.findElement(By.xpath("//a[text()='2']"));
                
                //Corner case: Always check the corner case for next Webelemnt contains disable property and stop loop.
                // if(next.getAttribute("aria-disabled").contains("true")){

                //     System.out.println("Pagination over , product not found");
                //     break;
                // }

              
                next.click();
            }
        }

}

    private static void selectProduct(String tshirt) {
        
        WebElement ele= driver.findElement(By.xpath("(//a[normalize-space()='"+tshirt+"'])[2]"));
        System.out.println(ele.getText());
    }

}