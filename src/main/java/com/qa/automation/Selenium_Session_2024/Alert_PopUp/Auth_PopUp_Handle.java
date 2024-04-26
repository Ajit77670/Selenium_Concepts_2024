package com.qa.automation.Selenium_Session_2024.Alert_PopUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auth_PopUp_Handle {
    
    public static void main(String[] args) {
        
        WebDriver driver = new ChromeDriver();

        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
    }
}


/*-----------Notes for Auth_Pop_Up--------------
 * 
 * In Such type of Authentication we need to pass the username and password at the  starting of the url adding @ followed by the url
 */