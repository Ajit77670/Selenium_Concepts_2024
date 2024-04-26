package com.qa.automation.Selenium_Session_2024.Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Key_Copy_Paste {
    
                

    public static void main(String[] args) {
       
       WebDriver driver = new ChromeDriver();
       driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

       WebElement fstname =driver.findElement(By.cssSelector("#input-firstname"));
       fstname.sendKeys("Ajit"); 
      
       WebElement lstname =driver.findElement(By.cssSelector("#input-lastname"));
      

       Actions act = new Actions(driver);
       act.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
       act.keyDown(Keys.CONTROL).sendKeys("c").build().perform();

       act.click(lstname);
       act.keyDown(Keys.CONTROL).sendKeys("v").build().perform();

    }
}
