package com.qa.automation.Selenium_Session_2024.SVG_element;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*------------NOTES FOR SVG ELEMENT----------
 * >> SVG elemnt needs special notaion for craeting Xpath
 * 1) Always start with //*[local-name()='svg'] , this will give us the total svg present in DOM
 *    and with this statement we can add another attribute using and , or.
 * 2) Now if we want to move to child elemnt , then we need to use //*[name()='g']
 *    and with this statement we can add another attribute using and , or. 
 */


public class SVG_elemnts_XPath {    
    
static WebDriver driver ;
public static void main(String[] args) throws InterruptedException {
    
     driver = new ChromeDriver();

     driver.get("https://petdiseasealerts.org/forecast-map#/");
     driver.manage().window().maximize();
     Thread.sleep(5000);

     //The SVG elemnt was inside the frame , this is the xpath fro switching to particular frame
     driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id ,'map-instance')]")));

// //*[local-name()='svg' and @id='map-svg']//*[name()='g']//*[name()='g' and @id='regions']//*[name()='path']


List<WebElement> list =driver.findElements(By.xpath("//*[local-name()='svg' and @id='map-svg']//*[name()='g']//*[name()='g' and @id='regions']//*[name()='path']"));

int total_countrylist =list.size();
System.out.println(total_countrylist);

for(WebElement ele : list){

   String cityName = ele.getAttribute("name");

   System.out.println(cityName);
}


}


}
