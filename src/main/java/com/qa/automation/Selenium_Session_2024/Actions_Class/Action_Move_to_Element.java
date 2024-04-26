package com.qa.automation.Selenium_Session_2024.Actions_Class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


/*-------------NOTE---------------
 * >> For Dropdown menu to freeze, use "debugger" command  in console of DOM and enter, it will freeze the webpage.
 * 
 */
public class Action_Move_to_Element {
    
public static void main(String[] args) throws InterruptedException {
    
    WebDriver driver  = new ChromeDriver();
    driver.get("https://www.spicejet.com/");
    driver.manage().window().maximize();
    Thread.sleep(3000);

    Actions act = new Actions(driver);

    WebElement Addon =driver.findElement(By.xpath("//div[text()='Add-ons']"));

    act.moveToElement(Addon).build().perform();

   List<WebElement> list = driver.findElements(By.cssSelector(".css-1dbjc4n.r-18u37iz.r-1w6e6rj.r-e65kyq.r-1t2hasf div div a"));
   Thread.sleep(3000);
   for(WebElement ele : list){

    String text =ele.getText();
    System.out.println(text);

    if(text.equals("SpiceMax")){

        ele.click();
        break;
    }
   }
}
   

    
}
