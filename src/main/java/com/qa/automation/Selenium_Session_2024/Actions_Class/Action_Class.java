package com.qa.automation.Selenium_Session_2024.Actions_Class;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Class {
    

    static WebDriver driver;
    public static void main(String[] args) {

        driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
        driver.manage().window().maximize();

        By email = By.cssSelector("#input-email");
        By pwd = By.cssSelector("#input-password");

        ActionSendKeys(email, "ajit");
        ActionSendKeys(pwd, "123");
        
    }



    public static WebElement getElement(By locator){
         return driver.findElement(locator);
    }

    public static void ActionSendKeys(By locator, String value){
        Actions act = new Actions(driver);
        act.sendKeys(getElement(locator),value).build().perform();
    }

    public static void doActionClick(By locator){
        Actions act = new Actions(driver);
        act.click(getElement(locator)).build().perform();
    }

}
