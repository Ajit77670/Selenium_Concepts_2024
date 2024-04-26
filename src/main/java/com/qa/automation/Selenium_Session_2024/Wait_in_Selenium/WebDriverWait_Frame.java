package com.qa.automation.Selenium_Session_2024.Wait_in_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.*;

public class WebDriverWait_Frame {
    
static WebDriver driver;  

public static void main(String[] args) {
        
        driver = new ChromeDriver();
        driver.get("https://www.londonfreelance.org/courses/frames/index.html");

    //      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    //      wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("main"));

    //    String text = driver.findElement(By.tagName("h2")).getText();
    //    System.out.println(text);

    WaitframeToBeAvailableAndSwitchToIt_Name_or_ID(10,"main");
    String text = driver.findElement(By.tagName("h2")).getText();
        System.out.println(text);
      
}  

//-----------Generic Methods WebDriverWait w.r.t Frames-----------------------
//Return WebDriver



// switch by nameORid
public static void WaitframeToBeAvailableAndSwitchToIt_Name_or_ID(int duration , String nameORid){

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
     wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(nameORid));
}

// switchTo by frame
public static void WaitframeToBeAvailableAndSwitchToIt_Name_or_ID(int duration , WebElement framelement ){

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
     wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(framelement));
}

// switchTo by Index
public static void WaitframeToBeAvailableAndSwitchToIt_Name_or_ID(int duration , int index){

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
     wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(index));
}

// switchTo by Locator
public static void WaitframeToBeAvailableAndSwitchToIt_Name_or_ID(int duration , By locator){

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
     wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator));
}

}
