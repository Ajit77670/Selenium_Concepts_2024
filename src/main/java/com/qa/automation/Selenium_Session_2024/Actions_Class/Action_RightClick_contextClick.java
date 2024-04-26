package com.qa.automation.Selenium_Session_2024.Actions_Class;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_RightClick_contextClick {
    
public static void main(String[] args) {   
    
    WebDriver driver = new ChromeDriver();
    driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
    driver.manage().window().maximize();

    WebElement rightclick = driver.findElement(By.xpath("//span[text()='right click me']"));
    

    Actions act = new Actions(driver); 
    act.contextClick(rightclick).build().perform();

    List<WebElement> list =driver.findElements(By.cssSelector("ul.context-menu-list span"));

    for(WebElement ele : list){

        String text =ele.getText();
        if(text.contains("Edit")){

            ele.click();

            Alert ale  = driver.switchTo().alert();

            String text1 =ale.getText();
            System.out.println(text1);
            ale.accept();
            break;

        }

    }

}

}
