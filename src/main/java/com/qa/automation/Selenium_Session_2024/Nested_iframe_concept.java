package com.qa.automation.Selenium_Session_2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nested_iframe_concept {
    
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
    
    driver = new ChromeDriver();

    driver.get("https://selectorshub.com/iframe-scenario/");
    Thread.sleep(3000);

    driver.switchTo().frame("pact1");
    driver.findElement(By.id("inp_val")).sendKeys("ajit");
    
    driver.switchTo().frame("pact2");
    driver.findElement(By.id("jex")).sendKeys("ajit");

    driver.switchTo().frame("pact3");
    driver.findElement(By.id("glaf")).sendKeys("ajit");

    
    //--------------------------------------------------------------------

    driver.switchTo().parentFrame();
    driver.findElement(By.id("jex")).sendKeys("hhhhh");

/*--------------Nested iframe concept------------------------
 * >> For Nested iframe we need to follow the sequence.
 * >> For ex : we have 10 frame then we need to move from frame1 to frame2 then frame3 and so on....
 * >> and to back to the previous frame we need to follow the backward order i.e frame10 to frame9 and so on
 * 
 * >>There is one more method given to back to previous frame that is driver.switchTo.parentFrame(), this 
 *   will go back to the previous frame.
 * 
 */

    
    
}

}
