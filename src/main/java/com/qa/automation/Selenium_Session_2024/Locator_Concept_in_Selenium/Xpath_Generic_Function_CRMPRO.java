package com.qa.automation.Selenium_Session_2024.Locator_Concept_in_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Generic_Function_CRMPRO {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        
        driver = new ChromeDriver();
        driver.get("https://classic.freecrm.com/");
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize(); 

        Thread.sleep(5000);

        driver.findElement(By.name("username")).sendKeys("newautomation");;
        driver.findElement(By.name("password")).sendKeys("Selenium@12345");
        driver.findElement(By.xpath("//input[@value='Login']")).click();

        driver.switchTo().frame("mainpanel");

        driver.findElement(By.xpath("//a[text()='Contacts']")).click();

        

    
      selectuser("Ali khan");  
      //selectuser("Ali khan");  
      selectuser("Chicago Bruner");  

       System.out.println(user_cmny_name("Ali khan"));
      System.out.println(user_cmny_name("Chicago Bruner"));

       System.out.println(user_phone_no("Ali khan"));
       System.out.println(user_phone_no("deepti gupta"));


       
 }

 //a[text()='Abel Kainan']/parent::td/preceding-sibling::td/input[@type='checkbox']
 // Function to select the user.
 public static void selectuser(String username){
WebElement ele =driver.findElement(By.xpath("//a[text()='"+username+"']/parent::td/preceding-sibling::td/input[@type='checkbox']"));
 ele.click();
 }  


 //a[text()='Abel Kainan']/parent::td/following-sibling::td/a[@context='company']
 //Function for company in which user is working.
public static String user_cmny_name(String username){
 WebElement ele =driver.findElement(By.xpath("//a[text()='"+username+"']/parent::td/following-sibling::td/a[@context='company']"));
   String text = ele.getText();
   return text;
}

// (//a[text()='Abel Kainan']/parent::td/following-sibling::td/span[@context='phone'])[1]
//Function for printing user phone no.
public static String user_phone_no(String username){
 return driver.findElement(By.xpath("(//a[text()='"+username+"']/parent::td/following-sibling::td/span[@context='phone'])[1]")).getText();
}
}
