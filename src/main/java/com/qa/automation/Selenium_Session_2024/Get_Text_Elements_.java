package com.qa.automation.Selenium_Session_2024;

import java.util.List;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Get_Text_Elements_ {
    

    static WebDriver driver;
    public static void main(String[] args) {
        

        Browser_Utility butil = new Browser_Utility();
        String browser ="chrome";
        driver =butil.InitDriver(browser);
        butil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

       By rightPannel = By.xpath("//aside[@id='column-right']//a");

       // Normal way of Printing the Elemnts text on Console.
       List<WebElement> list =driver.findElements(rightPannel);
       int Total_rightpannel_count =list.size();
       System.out.println("The total count of text in right pannel is :" +Total_rightpannel_count);

    //    for(WebElement ele : list){
    //    String text = ele.getText();
    //    System.out.println(text);
        

    // Validating the Elments Text list using Generic Method
     List<String> ele1 = getElemntsTextList(rightPannel);
      System.out.println(ele1.contains("Login"));
      System.out.println(ele1.contains("My Account"));
      System.out.println(ele1.contains("Wish List"));
      System.out.println(ele1.contains("Order History"));
       }

    

//----------Generic Methods---------------

    public static List<WebElement> getElements(By locator){

       return driver.findElements(locator);

    }


    public static List<String> getElemntsTextList(By locator){

        List<String> al = new ArrayList<>();
        List<WebElement> list = getElements(locator);
        for(WebElement ele : list)
        {
          String text =  ele.getText();
          al.add(text);  // adding the text to the new ArrayList
        }
             return al;   // We return new Array so that we can do some validation instead just printing on console.
        }

}