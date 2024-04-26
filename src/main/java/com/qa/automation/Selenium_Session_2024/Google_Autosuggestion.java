package com.qa.automation.Selenium_Session_2024;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*Note-- Find the correct xpath for autosuggestion will give right count of suggestion apper on Google serach.
>>esme kuch hidden counts bhi aa sakte hain jo ki visible nahi honge but we need to write xpath in a way that we can
 get the visble serach suggestion text.   
 * 
 */

public class Google_Autosuggestion {
    
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        
     driver = new ChromeDriver();   
    driver.get("https://www.google.com/"); 

    driver.findElement(By.name("q")).sendKeys("Naveen automation labs");

    Thread.sleep(3000);

    List<WebElement> list =driver.findElements(By.xpath("//li[@role='presentation']//div[@class='wM6W7d']/span"));

        int total_utosuggestion_count =list.size();
        System.out.println(total_utosuggestion_count);

        for(WebElement ele : list){

            String text =ele.getText();
            System.out.println(text); 
        }

    }


    // Generic Function to get the autosuggestionlist
    public static void doSearch(By suugestlocator , String suggName){

       List<WebElement> list = driver.findElements(suugestlocator);
       int totalsuggestion_count = list.size();
       System.out.println("The total suggestion count is " + totalsuggestion_count);

       for(WebElement ele : list){

        String text =ele.getText();

        System.out.println(text);

        if(text.contains(suggName)){

            ele.click();
            break;
        }

       }


    }
    
}
