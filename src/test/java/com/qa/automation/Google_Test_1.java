package com.qa.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Google_Test_1 {
    
    static WebDriver driver;
    
    @BeforeTest
    public void setup(){
     driver = new ChromeDriver();
     driver.get("https://www.google.com/");
    }


    @Test
    public void isSearchFieldVisible(){

       boolean flag = driver.findElement(By.name("q")).isDisplayed();
       Assert.assertTrue(flag);
    }

    @Test
    public void isGoogleLogoVisible(){

       boolean flag = driver.findElement(By.xpath("//img[@class='lnXdpd']")).isDisplayed();
       Assert.assertTrue(flag);
    }


    @AfterTest
    public void tearDown(){

        driver.quit();
    }


}
