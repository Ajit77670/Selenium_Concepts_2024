package com.qa.automation.Selenium_Session_2024.Select_Class_DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Genreic_Method_for_Multible_Dropdown {
    
    static WebDriver driver;
    public static void main(String[] args) {
        
        driver = new ChromeDriver();
        driver.get("https://www.microchip.com/prochiplicensing/#/");


        dropdown("When is your design planned for production?", "2023");
    }



    //Generic Method to  select the multiple dropdown : Try to find a simmillar pattern in all the dropdown.
    public static void dropdown (String label , String value)
    {   
    WebElement ele =driver.findElement(By.xpath("//label[text()='"+label+"']/preceding-sibling::select"));
    Select sc = new Select(ele);
    sc.selectByVisibleText(value);
    }






}
