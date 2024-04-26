package com.qa.automation.Selenium_Session_2024;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_Dynamic_Xpath_ESPN_CRIC {
    
static WebDriver driver;

public static void main(String[] args) {
    
    driver = new ChromeDriver();
    driver.get("https://www.espncricinfo.com/series/england-in-india-2023-24-1389386/india-vs-england-5th-test-1389403/full-scorecard");
    driver.manage().deleteAllCookies();
    driver.manage().window().maximize();

    String bat =wickettaket("Zak Crawley");
    System.out.println(bat);

   
   //List<String> list3 = batsman_scoreboard("Joe Root");
   // System.out.println(list3);
}           

// Generic Dynamic method for wickettaker
public static String wickettaket(String batsman){

   WebElement ele=  driver.findElement(By.xpath("(//span[text()='"+batsman+"']/ancestor::td//a[@title='"+batsman+"'])[1]/parent::div/../following-sibling::td/span"));
    String text =ele.getText();
    return text;  
}


//Generic method batsman scoreboard 
public static List<String> batsman_scoreboard(String batsmanname){

    List<WebElement> list =   
    driver.findElements(By.xpath("(//span[text()='"+batsmanname+"']/ancestor::td//a[@title='"+batsmanname+"'])[1]/ancestor::td/following-sibling::td[contains(@class,'ds-text-right')]"));

    List<String> list1 = new ArrayList<String>();
    for(WebElement ele : list){

     String text =  ele.getText();

     list1.add(text);
    }
    return list1;
    
}


}
