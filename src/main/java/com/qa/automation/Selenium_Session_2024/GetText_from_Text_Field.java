package com.qa.automation.Selenium_Session_2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText_from_Text_Field {
    
    static WebDriver driver;

    public static void main(String[] args) {
        

    WebDriver driver = new ChromeDriver();
    driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

    WebElement fname = driver.findElement(By.id("input-firstname"));
    fname.sendKeys("Ajit");

    String value_of_Text_field = fname.getAttribute("value");
    System.out.println(value_of_Text_field);

            

    /*-------------Note----------
     * >> We cannot pass the "null" character to the sendkeys ,string by default have null value and 
     *    passing the null caharacter again will give u IllegalArgumentException.
     */
}

}