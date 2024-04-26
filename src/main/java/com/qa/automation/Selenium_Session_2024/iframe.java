package com.qa.automation.Selenium_Session_2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {
    
    public static void main(String[] args) {
        

        WebDriver driver = new ChromeDriver(); 
        driver.get("https://www.formsite.com/templates/education/class-registration-form/");

        driver.findElement(By.xpath("//img[@title='Class-Registration-Forms-and-Examples']")).click();

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@src,'fs1.formsite')]")));

        driver.findElement(By.xpath("//input[@name='RESULT_TextField-1']")).sendKeys("Ajit");


        driver.switchTo().defaultContent();
    }
}
