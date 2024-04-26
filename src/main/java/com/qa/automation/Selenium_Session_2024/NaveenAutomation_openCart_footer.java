package com.qa.automation.Selenium_Session_2024;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaveenAutomation_openCart_footer {
    
    public static void main(String[] args) {
        
        WebDriver driver = new ChromeDriver();

        driver.get("https://naveenautomationlabs.com/opencart");
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

      By footer_list =  By.xpath("//div[@class='col-sm-3']/h5/parent::div//li");


      List<WebElement> list = driver.findElements(footer_list);

      int total_footer_count =list.size();
      System.out.println("totalfooter count is " +total_footer_count);

      for(WebElement ele : list){

       String text = ele.getText(); 
       System.out.println(text);
      }
    }
}
