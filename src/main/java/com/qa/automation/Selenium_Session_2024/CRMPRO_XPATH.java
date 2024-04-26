package com.qa.automation.Selenium_Session_2024;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CRMPRO_XPATH {
    
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        
        Browser_Utility butil = new Browser_Utility();
        String browser ="chrome";
        driver =butil.InitDriver(browser);

        butil.launchUrl("https://classic.freecrm.com/");
        Thread.sleep(5000);


       By username= By.name("username");
       By pwd = By.name("password");
       By loginbtn = By.className("btn-small");  // Note:- With By.ClassName only one class attribute is allow

     //   By loginbtnXPATH =By.xpath("div[@class='input-group-btn']/input[@value='Login']");   //altearnate locator for login button.

       By contactElem=  By.xpath("//*[@id=\"navmenu\"]/ul/li[4]/a");

      By chkbox_Abel_Kainan = By.xpath("//a[text()='Abel Kainan']/parent::td/preceding-sibling::td/input[@type='checkbox']");
       By Abel_Kainan__ful_details =By.xpath("//a[text()='Abel Kainan']/parent::td/following-sibling::td");
       

      By Ali_Khan_full_details = By.xpath("(//a[text()='Ali khan'])[1]/parent::td/following-sibling::td");
      By Ali_kha_contact_no = By.xpath("(//a[text()='Ali khan'])[1]/parent::td/following-sibling::td/span");
       
      
        driver.findElement(username).sendKeys("newautomation");
        driver.findElement(pwd).sendKeys("Selenium@12345");

        driver.findElement(loginbtn).click();

        Thread.sleep(5000);
        driver.switchTo().frame("mainpanel"); 
        driver.findElement(contactElem).click();

        driver.findElement(chkbox_Abel_Kainan).click(); 


        // Printing all the details asociated with Ali Kannan
        List<WebElement> list1 =driver.findElements(Abel_Kainan__ful_details);
        Thread.sleep(5000);
        for(WebElement ele1 : list1){
        String text1= ele1.getText(); 
        if(text1.length() > 0){       // check for not including blank text 
          System.out.println(text1);
          }
        }
    }

}
