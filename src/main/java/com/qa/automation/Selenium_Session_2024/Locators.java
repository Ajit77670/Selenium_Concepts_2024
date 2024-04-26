package com.qa.automation.Selenium_Session_2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Locators {
    
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        
        Browser_Utility butil = new Browser_Utility();

        // Initialize and Launch the Broser Main Page
        String browser = "chrome";
        driver = butil.InitDriver(browser);
        butil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");


        // Registration Page - By locators
       By RegisterPage = By.linkText("Register");
       By firstName = By.id("input-firstname");
       By lastName= By.name("lastname");
       By emailId =  By.xpath("//*[@id=\"input-email\"]");
       By telephone =By.cssSelector("#input-telephone");
       By pwd =By.id("input-password");
       By repwd=By.id("input-confirm");
       By subscribe_chkbox=  By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[2]/input");
       By Privacy_checkbox=By.cssSelector("#content > form > div > div > input[type=checkbox]:nth-child(2)");
       By Continue =By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");

      By continue1 = By.xpath("//*[@id=\"content\"]/div/div/a");

       // Main Login Page By - Locators
       By email = By.id("input-email");
       By cPwd = By.id("input-password");
       By loginbutton = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");


        // Using Elemnt Util perform the action
        Element_Utility ele = new Element_Utility(driver);

        ele.doClick(RegisterPage);
        ele.doSendKeys(firstName, "Ajit");
        ele.doSendKeys(lastName, "Srivastava");
        ele.doSendKeys(emailId, "ajit77670@gmailcom");
        ele.doSendKeys(telephone, "9035839080");
        ele.doSendKeys(pwd, "1234567");
        ele.doSendKeys(repwd, "1234567");
        ele.doClick(subscribe_chkbox);
        ele.doClick(Privacy_checkbox);
        ele.doClick(Continue);

        butil.QuitBroser();
        
       
        String browser2 = "chrome";
        driver = butil.InitDriver(browser2);
        butil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

        Element_Utility ele1 = new Element_Utility(driver);
        ele1.doSendKeys(email, "ajit77670@gmail.com");
        ele1.doSendKeys(cPwd, "1234567");
        ele1.doClick(loginbutton);

        //By locator after sucessful login.
        By Text_Afterlogin =By.linkText("Account"); 
        
       Thread.sleep(6000);
       String text_msg = ele1.doGetText(Text_Afterlogin);
       System.out.println(text_msg);
       butil.QuitBroser();

    }


  
}
