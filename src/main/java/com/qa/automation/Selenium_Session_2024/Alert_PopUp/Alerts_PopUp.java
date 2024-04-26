package com.qa.automation.Selenium_Session_2024.Alert_PopUp;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


// Note : Alert is an Interface having 4 Abstarct method.(accept(), dismiss(), gettext() , sendkeys()).

public class Alerts_PopUp {
    
    public static void main(String[] args) throws InterruptedException {
        
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");


       WebElement JS_Alert = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
       JS_Alert.click();

        WebElement JS_confirm = driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
        JS_confirm.click();

        WebElement JS_prompt = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
        JS_prompt.click();

       //Switch the driver to Alert 
       Alert ale = driver.switchTo().alert();  //Switch to Alert
        
        //Alert inbuilt methods.
            ale.sendKeys("Hello");
            ale.accept();
            ale.dismiss();
            ale.getText();
           


         // NoAlertPresentException  // will get this exeption when we dont switch to Alert and try to use alert functions.   
        
    }
}
