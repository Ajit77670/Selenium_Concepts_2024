package com.qa.automation.Selenium_Session_2024;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class List_of_WebElements_images {
    
static WebDriver driver;

public static void main(String[] args) {
    
    Browser_Utility butil = new Browser_Utility();
    String browser = "chrome";
    driver =butil.InitDriver(browser);
    butil.launchUrl("https://www.ogdivine.com/");


    By image_tag =By.tagName("img");

    List<WebElement> list =driver.findElements(image_tag);

    int total_image=list.size();
    System.out.println(total_image); 


    //----------for each loop-------------
    // int count =0;
    // for(WebElement ele : list){
    // System.out.println(count+":" +ele.getSize());
    //   count++;
    // }

    


    for(int i=0; i<total_image;i++){

       System.out.println(list.get(i).getSize());
    }

}



}
