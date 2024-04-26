package com.qa.automation.Selenium_Session_2024.BigBasket_L4_Category_Search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.qa.automation.Selenium_Session_2024.Element_Utility;

public class BigBasket_L4_Search {
    
    static WebDriver driver;
    static  Element_Utility eutil;
    public static void main(String[] args) throws InterruptedException {
        
        driver = new ChromeDriver();
        driver.get("https://www.bigbasket.com/");
        eutil = new Element_Utility(driver);

      By categoryClick= By.xpath("(//span[text()='Category'])[2]");
      eutil.ClicWhenReady(10, categoryClick);
      
      By L1 = By.linkText("Fruits & Vegetables");
      By L2 =By.linkText("Cuts & Sprouts");
      By L3 = By.linkText("Cut & Peeled Veggies");

    //   Actions act = new Actions(driver);
    //     act.moveToElement(driver.findElement(L1)).build().perform();
    //     act.moveToElement(driver.findElement(L2)).build().perform();
    //     act.moveToElement(driver.findElement(L3)).click().build().perform();
     
    selectBigbasketCategory("Foodgrains, Oil & Masala", "Dals & Pulses", "Toor, Channa & Moong Dal");

 }

    public static  void selectBigbasketCategory(String L1 , String L2 ,String L3) throws InterruptedException{

      //Dynamic Xpath Locator
        // Actions act = new Actions(driver);
        // Thread.sleep(5000);
        // act.moveToElement(driver.findElement(By.xpath("(//a[text()='"+L1+"'])[2]"))).build().perform();
        // Thread.sleep(5000);
        // act.moveToElement(driver.findElement(By.xpath("//a[text()='"+L2+"']"))).build().perform();
        // Thread.sleep(5000);
        // act.moveToElement(driver.findElement(By.xpath("//a[text()='"+L3+"']"))).click().build().perform();

        //Dynamic LinkText Locator
        Actions act = new Actions(driver);
        Thread.sleep(5000);
        act.moveToElement(driver.findElement(By.linkText(L1))).build().perform();
        Thread.sleep(5000);
        act.moveToElement(driver.findElement(By.linkText(L2))).build().perform();
        Thread.sleep(5000);
        act.moveToElement(driver.findElement(By.linkText(L3))).click().build().perform();

 }


}
