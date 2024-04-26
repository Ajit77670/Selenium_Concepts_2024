package com.qa.automation.Selenium_Session_2024.Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import org.openqa.selenium.WebElement;

public class Loop_Test {
    
    static WebDriver driver;

    public static void main(String[] args) {
        
        driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=product/product&product_id=45&search=Macbook");
    
        
        By ProductPriceData = By.xpath("(//ul[@class='list-unstyled'])[position()=9]/li");

        List<WebElement> priceList = driver.findElements(ProductPriceData);
         System.out.println(priceList.get(1).getText());
            
        
    }
}

