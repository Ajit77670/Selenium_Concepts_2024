package com.qa.automation.Selenium_Session_2024.Actions_Class;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Key_Scroll_UP_and_Scroll_Down {
    
public static void main(String[] args) {
    
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.amazon.in/");


    Actions act = new Actions(driver); 

    act.keyDown(Keys.CONTROL).sendKeys(Keys.DOWN).build().perform();
    act.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).build().perform(); 
}
   
    


}
