package com.qa.automation.Selenium_Session_2024.Locator_Concept_in_Selenium;

public class Xpath_2 {
    
}

/* -------------------Notes------------------------
 *   1) /.. -->-is the backward traversal to reach its  parent tag and the same can be written as --> parent::tagname
 *   2)// ---> direct + indirect 
 *   3)/ ---> direct     
 * 
 *   4) preceding-sibling::tagname ---> for going back to its sibling 
 *   5) following-sibling::tagname ---> for going forward direction to itd sibling.
 * 
 *   6)[position()='index']   or  (//xpath)[index]
 *   7)[last()] or [last()-1] , [last()-2] , these are for elemnt at last 
 * 
 */

//  ((//div[contains(@class,'navFooterLinkCol')])[last()]//a)[last()]  --> Amazon Xpath for help in footer section
//  ((//div[contains(@class,'navFooterLinkCol')])[last()]//a)[last()-1] --> Amazon Xpath for 2nd last in footer section of help(4t col)



//--------Notes for By.xpath and By.className for attribute class values more than 1------
// When class attribute have more than 1 class, take all  class in that case when craeting xpath
//  Ex :  By.xpath(//input[@class='form-control private-form__control login-email'])  ---valid
//        By.xpath(//input[@class=login-email'])  ----not valid

// By.className("form-control private-form__control login-email")  ---> Not valid only one class is allowed
// By.className(" login-email")  ----> valid 


//-----------------classic free CRM ------------Xpaths

//a[text()='Abel Kainan']/parent::td/preceding-sibling::td/input[@type='checkbox']  --> contact -- Abel Kainan left checkbox
//a[text()='Abel Kainan']/parent::td/following-sibling::td/input[@type='checkbox']   --> Abel Kainan right side elemnts  Xpath

