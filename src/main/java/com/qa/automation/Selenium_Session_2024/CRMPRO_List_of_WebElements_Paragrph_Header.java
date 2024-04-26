package com.qa.automation.Selenium_Session_2024;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


// Qn : To Print the ParaGraph of the particular section. I find the custom xpath and then get the text.
public class CRMPRO_List_of_WebElements_Paragrph_Header {
    
    static WebDriver driver;
    public static void main(String[] args) {
        
        Browser_Utility butil = new Browser_Utility();
        String browser ="chrome";
        driver =butil.InitDriver(browser);
        butil.launchUrl("https://www.crmpro.com/");

      By Section_ParaGraph =  By.xpath("//section[@id='details']//p"); // used //p for indirect child paragraph


      // By paragraph_tag = By.tagName("p");   

      // This will give all the paragraph on the web page but i need specific part so 
     //i find the customized xpath and get the text.

        List<WebElement> list = driver.findElements(Section_ParaGraph);

        System.out.println(list.size());

        for(WebElement ele : list){

           String str = ele.getText();

           System.out.println(str);
        }
    }
       

}
