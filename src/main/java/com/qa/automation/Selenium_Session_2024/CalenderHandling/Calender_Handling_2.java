package com.qa.automation.Selenium_Session_2024.CalenderHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender_Handling_2 {
    
    /*-------Note with Goibibi.com we have two calender appear together , mostly asked to find the correct 
             locator using css, always remmeber try using :not()
     * 
     */

    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        
        driver = new ChromeDriver();
        driver.get("https://www.goibibo.com/hotels/?utm_source=Affinity&utm_medium=DisplayAffiliate_5430c13718ef1cb7290a14bf13746db6&utm_campaign=Affinity");
        Thread.sleep(5000);

        
        WebElement pastDate= driver.findElement(By.cssSelector(".date_is_selectable_false"));

    }
}

/*------------- :not() , locator startegy in CSS very powerful
 * Ex: div.dcalendar-newstyles__CalendarMainWrapperDiv-sc-1i003by-13.ipjkXR ul li span:not(.date_is_selectable_false)
 * 
 * >> If before not gives you suppose 20 elemnts , you want to exclude some attribute then you can use with :not()
 */