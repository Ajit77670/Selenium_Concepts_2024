package com.qa.automation.Selenium_Session_2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_html {
    

    public static void main(String[] args) {
        
        WebDriver driver = new ChromeDriver(); 
        driver.get("https://www.londonfreelance.org/courses/frames/index.html");

        int totalFrame = driver.findElements(By.tagName("frame")).size();
        System.out.println(totalFrame);
  
        // 3 Ways to switch the frame
        driver.switchTo().frame(2);
        driver.switchTo().frame("main");
        driver.switchTo().frame(driver.findElement(By.xpath("//h2[text()='Title bar ']")));
       
        
        String text = driver.findElement(By.xpath("//h2[text()='Title bar ']")).getText();
        System.out.println(text);
    }  
}
