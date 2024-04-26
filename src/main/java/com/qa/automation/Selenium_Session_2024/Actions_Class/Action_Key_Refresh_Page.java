package com.qa.automation.Selenium_Session_2024.Actions_Class;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Key_Refresh_Page {
    
    public static void main(String[] args) throws InterruptedException {
       
       WebDriver driver = new ChromeDriver();
       driver.get("https://amazon.in");
       Thread.sleep(8000);

        Actions act = new Actions(driver);
        act.keyDown(Keys.CONTROL).sendKeys(Keys.F5).keyUp(Keys.CONTROL).build().perform();
        
       
                  
}

}
