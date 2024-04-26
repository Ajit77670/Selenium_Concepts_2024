package com.qa.automation.Selenium_Session_2024.Select_Class_DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


/*---------------SELECT Class in Selenium--------------
 * >> To use select we neeed to create the object of Select class.
 * >> Select classs basically use for dropdown and it used if in DOM select tag is given.
 * >>Note: Select class can only be used if the Drodown uses the select tag in DOM.
 * 
 * >> To use the Select class we need to pass the Webelemnt  as parameter to its constructor.
 *    i.e Select sc = new Select(Webelemnt);
 * 
 * >> Select class 3 + 1 = 4 imp methods by which we can select the list from dropdown.
 *     1) selectByIndex
 *     2) selectbyValue
 *     3)SelectBy VisibleText
 *     4)select.getOptions();   // This will return the List<WebElemnt>, using this we can iterate and fetch the details.  
 * 
 */

public class Select_Class_Concept_1 {
    

    static WebDriver driver; 

    public static void main(String[] args) {
        
       driver = new ChromeDriver();
       driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
       driver.manage().deleteAllCookies();
       driver.manage().window().maximize();


       By dropdownList = By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select");
       WebElement ele =driver.findElement(dropdownList);  
       
       
        Select select = new Select(ele);  
       
    //    select.selectByIndex(2);      // By index
    //    select.selectByValue("ALA");  // Value we can select from DOM, then pass 
    //    select.selectByVisibleText("Åland Islands"); // This we can select from DropDown

        List<WebElement> list =select.getOptions();     // This getOption will return the List<WebElement>.
        
        int total_count_of_dropdown =list.size();
        System.out.println(total_count_of_dropdown);  // Prints total size of dropdown 

        for(WebElement elements : list){  // We can fetch the details from the List<WebElements> by getOptions() method.

            String text=elements.getText();
            System.out.println(text);

            if(text.equals("Albania")){  // clicking on partcular list from dropdown

                elements.click();
                break;                   // break , so that it will not search all the next elemnts 
            }
        }

    }


}
