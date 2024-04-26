package com.qa.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.*;

public class LoginPage_Negative_Test {
    
    static WebDriver driver;
   

    public boolean doLoginNegativeTest(String username,String pwd){

        driver.findElement(By.cssSelector("#input-email")).clear();
        driver.findElement(By.cssSelector("#input-email")).sendKeys(username);

        driver.findElement(By.cssSelector("#input-password")).clear();
        driver.findElement(By.cssSelector("#input-password")).sendKeys(pwd);
        
        driver.findElement(By.xpath("//input[@value='Login']")).click();

       String ErrorMsg = driver.findElement(By.cssSelector("div.alert.alert-danger.alert-dismissible")).getText();

       if(ErrorMsg.contains("Warning: No match for E-Mail Address and/or Password.")){
             return true;
       }     return false;
    }


    @BeforeTest
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @DataProvider
    public Object[][] getloginTestNegativeData(){

        return new Object[][] {

            {"kajal", "656"},
            {"babab", "1222"},
            {"hdhhd", "1222"},
            {"sjsjjsjs", "1222"}

        };
    }

    @Test(dataProvider = "getloginTestNegativeData" )
    public void loginTest(String user , String password){
     boolean flag =doLoginNegativeTest(user, password);
     Assert.assertTrue(flag);
    }



    @AfterTest
    public void tearDown(){
    driver.quit();
     }


}
