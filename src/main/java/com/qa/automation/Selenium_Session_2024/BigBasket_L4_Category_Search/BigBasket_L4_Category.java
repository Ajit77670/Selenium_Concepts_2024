package com.qa.automation.Selenium_Session_2024.BigBasket_L4_Category_Search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasket_L4_Category {
    
    static WebDriver driver;

    
    public static void main(String[] args) throws InterruptedException {
        
        driver = new ChromeDriver();

        driver.get("https://www.bigbasket.com/");
        Thread.sleep(5000);
        driver.manage().window().maximize();

    //    WebElement L1Cat= driver.findElement(By.xpath("(//*[local-name()='svg' and @class='CategoryMenu___StyledArrowDown-sc-d3svbp-3 iwTeGC']//*[name()='path'])[2]"));
       
    //    Actions act = new Actions(driver);
    //    act.click(L1Cat).build().perform();

    //    Thread.sleep(2000);
    //    WebElement L2Cat=driver.findElement(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[2]"));
    //    act.moveToElement(L2Cat).build().perform();

    //    Thread.sleep(2000);
    //    WebElement L3Cat=driver.findElement(By.xpath("//a[text()='Dals & Pulses']"));
    //    act.moveToElement(L3Cat).build().perform();

    //    Thread.sleep(2000);
    //    WebElement L4Cat=driver.findElement(By.xpath("//a[text()='Toor, Channa & Moong Dal']"));
    //    act.moveToElement(L4Cat).click().build().perform();


    Actions act = new Actions(driver);
    WebElement L1Cat= driver.findElement(By.xpath("(//*[local-name()='svg' and @class='CategoryMenu___StyledArrowDown-sc-d3svbp-3 iwTeGC']//*[name()='path'])[2]"));
    act.click(L1Cat).build().perform();
    Thread.sleep(2000);
       
     L4category("Foodgrains, Oil & Masala", "Dals & Pulses", "Toor, Channa & Moong Dal");

    }


    public static void  L4category(String L2 ,String L3,String L4) throws InterruptedException{

        Actions act = new Actions(driver);


       Thread.sleep(2000);
       WebElement L2Cat=driver.findElement(By.xpath("(//a[text()='"+L2+"'])[2]"));
       act.moveToElement(L2Cat).build().perform();

       Thread.sleep(2000);
       WebElement L3Cat=driver.findElement(By.xpath("//a[text()='"+L3+"']"));
       act.moveToElement(L3Cat).build().perform();

       Thread.sleep(2000);
       WebElement L4Cat=driver.findElement(By.xpath("//a[text()='"+L4+"']"));
       act.moveToElement(L4Cat).click().build().perform();




    }
}
