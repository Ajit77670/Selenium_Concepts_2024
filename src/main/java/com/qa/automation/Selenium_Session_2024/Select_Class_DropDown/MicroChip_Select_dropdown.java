package com.qa.automation.Selenium_Session_2024.Select_Class_DropDown;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MicroChip_Select_dropdown {
    
    static WebDriver driver;

    public static void main(String[] args) {
        

    driver = new ChromeDriver();   

    driver.get("https://www.microchip.com/prochiplicensing/#/");
    driver.manage().deleteAllCookies();
    driver.manage().window().maximize();  

    WebElement ele =driver.findElement(By.id("productionYear"));
    Select sc = new Select(ele);
    sc.selectByVisibleText("2023");  


// Without select class  -- selecting year 2023
//    List<WebElement> list= driver.findElements(By.xpath("//label[text()='When is your design planned for production?']/preceding-sibling::select[@id='productionYear']/option"));
    
//       for(WebElement ele : list){

//        String text = ele.getText();

//        if(text.equals("2023")){

//         ele.click();
//        }

//       }

}
}
