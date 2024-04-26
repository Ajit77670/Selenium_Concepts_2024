package com.qa.automation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.*;

public class Amazon_Test {
    
    static WebDriver driver  ;

@BeforeTest
public void setup(){    

    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.manage().deleteAllCookies();
    driver.manage().window().maximize();
    driver.get("https://amazon.in");

}

@Test
public void searchTextFieledExistTest(){
    boolean flag = driver.findElement(By.cssSelector("#twotabsearchtextbox")).isDisplayed();
    Assert.assertTrue(flag);
    
}

@Test
public void AmazonTitleTest(){

    String title =driver.getTitle();
    System.out.println(title);
    Assert.assertEquals(title, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
}


@AfterTest
public void tearDown(){

    driver.quit();
}




}
