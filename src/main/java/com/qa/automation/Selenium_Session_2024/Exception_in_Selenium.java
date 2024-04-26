package com.qa.automation.Selenium_Session_2024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exception_in_Selenium {
    
public static void main(String[] args) {
   
   WebDriver driver = new ChromeDriver();
   
}

}

/*----------------------Exception in Selenium-------------------
 * 
 * 1)Null Pointer Exception --- when reference variable is not initialized it will give Null Pointer Exception.
 *   Ex: When Webdriver reference variable i.e  "driver" is not intailized and we are using it it will give 
 *       Null Pointer Exception. 
 *       driver= new ChromeDriver(); but driver is not intialized with WebDriver and we are using it.
 * 
 * 
 * 2)NoSuchElemnt Exception --- this will probably happen with incorrect locator, when our locator is not correct
 *        or on webpage the locator path got changed in that case this exception will be thrown.
 *        The syntax for locator is correct but we are using inside attribute which may not be the correct attribute. 
 * 
 * 3)NoSuchSessionException --- when we quit or close the browser and again using the driver then in that case we
 *          will get NoSuchSessionException. 
 * 
 * 4)ElementNotIntercableException / ElementNotIntreceptedException --- this exception occur when the element
 *      is available on the page but for some reason the driver not able to interact in such cases use 
 *       the Action class to interact with webelement if the webelemnt is active , if the webelement is disable then
 *       it will throgh the same exception.
 * 
 * 5) IllegalArgumentException ---- We cannot pass the "null" character to the sendkeys ,string by default 
 *    have null value and passing the null caharacter again will give u the IllegalArgumentException.
 * 
 * 6)ElementClickInterceptedException----- for example suppose we are clicking on btn which is disabled , then in
 *      such cases we will get this type of Exception but for some application it may it will not throgh any Exception.
 * 
 * 7) InvalidSelectorException --- this type of Exception will be thrown when will have wrong locator syntax.
 * 
 * 8) NoAlertException --- When there is No Alert on the webPage but we are trying switching on the webPage then in that
 *       case it will throw NoAlertException.
 * 
 * ------------------------------StaleElementException Reason---------------------------------------
 * 9) StaleElementException --- This exception occur when we trying to interact with the webelemnts 
 *    after refreshing the browser.
 * 
 * >>This exception occurs when the web element gets detached from the current DOM , that is after refresh the new DOM 
 *   will be available.
 * 
 * 
 * >>Basically you need to identify why is stale element exception coming in your code?

    Either page is getting refreshed between element selection and performing action on that element or you have 
    created list of elements and for first element it works fine but after that it will give stale element exception.

    For first use case you have to use wait(Fluent Wait) for element present and then try to perform action, 
    if you still get error then use catch block for retry.

    For second use case find only one element at a time and then perform action and 
    repeat the same for another pages.

    There is one more use case which I have seen where HTML page auto refreshes in that case you have to 
    disable that otherwise it is very difficult to predict the behaviour at run time.

    ----------------------------------------------------------------------------------------------------------------
 * 
 * 10) TimeOutException
 * 
 * 
 * 
 * 










     */                     
 
