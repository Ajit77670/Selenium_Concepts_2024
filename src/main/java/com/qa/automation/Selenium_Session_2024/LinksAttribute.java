package com.qa.automation.Selenium_Session_2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LinksAttribute {
    

    static WebDriver driver;
    public static void main(String[] args) {
        

        Browser_Utility butil = new Browser_Utility();
        String browser ="chrome";
        driver =butil.InitDriver(browser);
        butil.launchUrl("https://www.aeroarmour.store/");

       By link = By.tagName("a");
       By images = By.tagName("img");

       List<WebElement>  list = getElements(link);
        int Total_link_on_Armaor_Site = list.size();
        System.out.println(Total_link_on_Armaor_Site);

        // for(WebElement ele : list){

        //    String href = ele.getAttribute("href");
        //    String Text =ele.getText();

        //    System.out.println(href+ " " +"----->" +Text);
        // }

       // getElementAttributes(link, "href");
        getElementAttributes(images, "text");


}
    //-------------------------Generic Methods---------------------------

    // Generic Method for findElements
    public static List<WebElement> getElements(By locator){
    return driver.findElements(locator);
    }


    

    //Generic Method for fetch the Attribute value applicable for findElemets i.e List<WebElement>
    public static void getElementAttributes(By locator , String attribue){

        List<WebElement> list =getElements(locator);
        for(WebElement ele :list){

           String attValue = ele.getAttribute(attribue);
            System.out.println(attValue);
        }
    }

    // Generic mEthod for Total Element Count.
    public static int getTotalElementsCount(By locator){
       return getElements(locator).size();
    }

}