package com.qa.automation.Selenium_Session_2024.Select_Class_DropDown;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



public class Select_Class_Generic_Methods {
    
    static WebDriver driver;
    public static void main(String[] args) {
        
    }


        
    //Function to getWebElemt
    public static WebElement getElement(By locator){
    return driver.findElement(locator);
    }


    //Function to select element in DropDown by Index
    public static void doSelectDropdown_ByIndex(By locator , int index){

        Select sc = new Select(getElement(locator));
        sc.selectByIndex(0);
     }


     //Function to select element in DropDown by Value
     public static void doSelectDropdown_Byvalue(By locator, String value){

        Select sc = new Select (getElement(locator));
        sc.selectByValue(value);

     }

     // Function to select Dropdown by Visible Text
     public static void doSelectDropdown_ByVisibleText(By locator, String value){

        Select sc = new Select (getElement(locator));
        sc.selectByVisibleText(value);
     }

//--------------Function/Method Wrapping over the getOption -------------------------

     // Function which return the getOption itself.
      public static List<WebElement> doSelect_By_Optons(By locator){
       Select sc = new Select(getElement(locator));
        return  sc.getOptions();
        }


        // Function which returns the size of dropdown
        public static int getDropdownSize(By locator){
         return  doSelect_By_Optons(locator).size();
        }
    


        // Function which will return the GetTextOtion
        public static List<String> getDropdownText(By locator){
            
           List<WebElement> list = doSelect_By_Optons(locator);

           List<String> newlist = new ArrayList<>();
           for(WebElement ele : list){
           String text = ele.getText();
           newlist.add(text);
           }

              return newlist;

           }


        // Function to select the dropdown by using getOption   

        public static void selectDropDown_getOption_by_value(By locator, String value){

            List<WebElement> list = doSelect_By_Optons(locator);
            for(WebElement ele : list){

               String text = ele.getText();
               if(text.equals(value)){

                ele.click();
                break;
               }
            }

        } 


         
        





}
