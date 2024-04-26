package com.qa.automation.Selenium_Session_2024.Locator_Concept_in_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_1 {
    
    //--------------------------normal xpath---------------------------------------------------
    //tag[@attr='value']
    //img[@alt='freshworks-logo']

    //tag[@attr1='value' and @attr2='value']  --including 2 attribute with and operator
    //img[@alt='freshworks-logo' and  @role='presentation']
    //img[@alt='freshworks-logo' and  @role='presentation'  and @decoding='async'] -- using 3 attribute

    //tag[@attr1='value' or  @attr2='value']  -- including 2 attribute using or operator
    //img[@alt='freshworks-logo' or  @role='presentation']

    //---------------------text()----------------------------------

    //Xpath for text based element. We use text() functin here.
    //h2[text()='Happy customers. Energized employees. That’s impact.']

    //text() with attribute
    //tag[@attr='value' and text()='value']
    //h2[text()='Happy customers. Energized employees. That’s impact.' and @class='sc-4555ca6a-0 cXWnXL']

     //tag[@attr1='value' and @attr2='value' and text()='value']

     //---------------------------------------Contains()------------------------------------------------------

     //contains with attribute
     //h2[contains(@class,'sc-4555ca6a-0 cXWnXL')]
     //input[contains(@placeholder,'E-mail')]
     //input[contains(@placeholder,'E-mail') and @name='email'] 

     //contains() with text() combination
     //tag[contains(text(),'value')]
     //h2[contains(@class,'sc-4555ca6a-0 cXWnXL') and text()='Happy customers. Energized employees. That’s impact.']

    //contains() with text() and attribute
    //tag[contains(text(),'value') and contains(@attr,'value')]


    //---------------------------------starts-with()-------------------------------------------------------------------
    //start-with used for text 
    //tag[@starts-with(text(),'value')]
    //a[starts-with(text(),'Amazon')]
    //a[starts-with(@href,'E-mail')]
    //h2[starts-with(text(),'Happy customers. Energized employees. That’s impact.')]    

    
}
