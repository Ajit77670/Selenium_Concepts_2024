package com.qa.automation.Selenium_Session_2024;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElement_Exception {
    
  /*  -----------------How To handle Stale Element Exception-----------
   * >> Stale Element Exception occurs generally when the page got refresh 
   *   or we landed onto some new page and then come back to parent page, in these cases we can get stale elemnt exception.
   * 
   * >> It can also occur when we trying clicking on the diffrent links for the elements we collect in List<WebElemnt>.
   
   >> Handle ways:
    1) By reinitializing the webelement after refresh/click/back
    2) By using FluentWait and applying the conditin ignoring.StaleElemntException
    3)By using By locator concept , just pass locator instead webelemnt
   */

    public static void main(String[] args) throws InterruptedException {
        
    WebDriver driver = new ChromeDriver();
    driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
    Thread.sleep(5000);
    driver.manage().window().maximize();

        //WebElement fname = driver.findElement(By.id("input-firstname"));
       // fname.sendKeys("Ajit");
    
        //driver.navigate().refresh();
       // fname.sendKeys("Ajit");  //This will give stale elemnt exception

        //fname = driver.findElement(By.id("input-firstname"));  // we need to declare the element again after the refresh 
        //fname.sendKeys("Ajit");


      // 2nd Case for State elemnt Exception:
      
      List<WebElement> list = driver.findElements(By.cssSelector("div.row ul.list-unstyled li")); // suppose we have 10 elemnts of list on which we have to click.

      System.out.println(list.size());
      //Thread.sleep(2000);


      for(int i=0 ; i<list.size();i++){

        list.get(i).click();      // for first elemnt it will click but might it will throgh stale elemnt exception on clicking on other elements  
        driver.navigate().back();
        Thread.sleep(1500);
        list = driver.findElements(By.cssSelector("div.row ul.list-unstyled li"));  // so we need to decalare the List<WebElemnt> refernce as many times the elemnt going to be clicked in the loop.
       
       
    }

}


}
