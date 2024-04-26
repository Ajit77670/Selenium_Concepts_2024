package com.qa.automation.Selenium_Session_2024.Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Drag_and_Drop {
    
    public static void main(String[] args) {
        
        WebDriver driver = new ChromeDriver();

        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();

        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));

        WebElement src = driver.findElement(By.cssSelector("#draggable>p"));
        WebElement target = driver.findElement(By.cssSelector("#droppable>p"));

        Actions act = new Actions(driver);
       
       //using dragAndDrop() method of Action class.
        act.dragAndDrop(src, target).release().build().perform();


       //using break actions 
       act.clickAndHold(src)
            .moveToElement(target)
                .release()
                    .build().perform();

    }

}
