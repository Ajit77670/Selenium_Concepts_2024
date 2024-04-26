package com.qa.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Amazon_Test_1  {
    
    static WebDriver driver;

   @BeforeTest
   public void setup(){
    driver = new ChromeDriver();
    driver.get("https://www.amazon.in/");
   }
   
   @Test
   public void titleTest(){
       String title =driver.getTitle();
       Assert.assertEquals(title, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
    }

    @Test
    public void AmazonLogoTest(){
     boolean flag =  driver.findElement(By.xpath("//a[@aria-label='Amazon.in']")).isDisplayed();
      Assert.assertTrue(flag);
    }

    @Test
    public void AmazonHelpTest(){
     boolean flag =  driver.findElement(By.xpath("//a[text()='Help']")).isDisplayed();
      Assert.assertTrue(flag);
    }   


   @AfterTest
   public void tearDown(){
    driver.quit();
   }

    
}
