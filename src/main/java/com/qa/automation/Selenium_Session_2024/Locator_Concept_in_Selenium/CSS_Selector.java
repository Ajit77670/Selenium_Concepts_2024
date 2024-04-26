package com.qa.automation.Selenium_Session_2024.Locator_Concept_in_Selenium;

import org.openqa.selenium.WebDriver;

public class CSS_Selector {
    
    static WebDriver driver;
    public static void main(String[] args) {
        
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
    }
}


/*  -----------------CSS selector notatio---------------------
 *  .  --> class
 *  #  --> id
 *  [][][]   --> used "and" operator for sperate attributes
 *  , ----> we can use comma for "or" 
 * 
 *  Backward traversing is not possible in CSS.
 *  Text() function is not applicable in CSS.
 * 
 *  ---------Parent-child----------
 * > -->direct sibling
 * space --> direct + indirect sibling 
 * 
 *   *  --> contains
 *   ^  --starts-with
 *   $  -- ends-with
 * 
 * ------------First-child , last-child  & nth-of-type() in CSS  -----------
 * >>Ex:   #Form_getForm_Country>option:last-child
 * >>Ex:   #Form_getForm_Country>option:first-child
 * >>EX:   #Form_getForm_Country>option:nth-of-type(1)      // For particular index
 * 
 * 
 * --------------Main functionality of CSS selector---------
 *    
 * >> we can group no. of locators together. 
 *    The advantage of this we can check in particular web page if the main webelemnt are present or not.
 *  Ex : input#username,#password,button#loginBtn
 * 
 * >> We can exclude the particular webElement from the suggestion, i.e if we have 5 option we can exclude
 *    the partculear webelemnt using "not:"
 * 
 * ex: input.form-control:not(#input-lastname,#input-telephone,#input-password)  -- excluding multiple webelement option
 */   