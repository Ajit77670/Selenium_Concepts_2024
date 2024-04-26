package com.qa.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.*;

public class Registtarion_Page_with_Data_Provider {
    
static WebDriver driver;


    public boolean RegisterationMethod(String fname ,String lname , String email, String contactNo ,String pwd ,String cpwd){

        driver.findElement(By.cssSelector("#input-firstname")).clear();
        driver.findElement(By.cssSelector("#input-firstname")).sendKeys(fname);

        driver.findElement(By.cssSelector("#input-lastname")).clear();
        driver.findElement(By.cssSelector("#input-lastname")).sendKeys(lname);

        driver.findElement(By.cssSelector("#input-email")).clear();
        driver.findElement(By.cssSelector("#input-email")).sendKeys(email);

        driver.findElement(By.cssSelector("#input-telephone")).clear();
        driver.findElement(By.cssSelector("#input-telephone")).sendKeys(contactNo);

        driver.findElement(By.cssSelector("#input-password")).clear();
        driver.findElement(By.cssSelector("#input-password")).sendKeys(pwd);

        driver.findElement(By.cssSelector("#input-confirm")).clear();
        driver.findElement(By.cssSelector("#input-confirm")).sendKeys(cpwd);

        driver.findElement(By.xpath("//input[@name='newsletter' and @value=0]")).click();
        driver.findElement(By.xpath("//input[@name='agree' and @value=1]")).click();
        driver.findElement(By.xpath("//input[@value='Continue']")).click();

       WebElement AccntConfirmation = driver.findElement(By.cssSelector("#content"));
       String confirmText =AccntConfirmation.getText();

       if(confirmText.contains("Your Account Has Been Created!")){

            return true;
       }

       driver.navigate().back();


       return false;

      
    }


  @BeforeTest
  public void setup(){

    driver = new ChromeDriver();
    driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    driver.manage().window().maximize();
    
  }  


  @DataProvider
  public Object[][] RegistartionData(){

    return new Object[][]{

        {"ajkttt","kumar" ,"ajyt878@gmail.com","9858989859" ,"wewewewe", "wewewewe"}, 
        {"olapa","kumar" ,"ajyt879@gmail.com","9858989898" ,"wewewewe", "wewewewe"}, 
        {"pobaa","kumar" ,"ajut877@gmail.com","9888989896" ,"wewewewe", "wewewewe"}, 
        {"tomlaa","kumar" ,"ajht876@gmail.com","9897989878" ,"wewewewe", "wewewewe"}, 

    };

  }

  @Test(dataProvider = "RegistartionData")
  public void doRegistration(String fname ,String lname , String email, String contactNo ,String pwd ,String cpwd){

    boolean flag =RegisterationMethod(fname, lname, email, contactNo, pwd, cpwd);

    Assert.assertTrue(flag);
  }


  @AfterTest
  public void tearDown(){

    driver.quit();
  }


}
