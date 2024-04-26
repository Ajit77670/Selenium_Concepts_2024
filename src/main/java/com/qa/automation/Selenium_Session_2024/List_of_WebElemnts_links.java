package com.qa.automation.Selenium_Session_2024;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class List_of_WebElemnts_links {
    
   static  WebDriver driver;
    public static void main(String[] args) {
        
        Browser_Utility butil = new Browser_Utility();
        String browser = "chrome";    
        driver =butil.InitDriver(browser);
        butil.launchUrl("https://www.ogdivine.com/");

        //Count the Total no. of links on Amazon WebPage

        By link_Tag = By.tagName("a");
        List<WebElement> list =driver.findElements(link_Tag);

        int toatl_links=list.size();
        System.out.println("Total links available on webPage is  " +toatl_links);

        //-----------------------for each loop-----------------------------------
        //for each loop : for printing the all links available on webPage excluding the blank space in between.
        int count=0;
        for (WebElement ele : list) {
         
           String text =ele.getText();
           if(text.length()>0){
            System.out.println(count +":" +text);
           }
           count++;
        }

        /*  --------------------Note b/w for and for each loop
         * >> To fetch the all elemnts using traditional for loop we need to include get(i).getText(); i.e to inclde index no.
         * >>Where as in for each loop it will automatically include the index no for iteration and thats why it called as 
         *   for each loop.
         */
        
        //-------------------for loop--------------------------------
        // for loop : for printing the all links available on webPage excluding the blank space in between.
        // for(int i=0 ; i<list.size();i++){

        //    String text =list.get(i).getText(); // In order to skip the blank space , store the elemnts in String  as getText() will return String type.

        //    if(text.length()>0){   // and now put the condition for string having length greater than 0 , print those text only with its index.

        //     System.out.println(i +":" +text);
        //    }
        // }
           
         }

    }


