package com.qa.automation.Selenium_Session_2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload_PopUp {
    

    /*-------------Note for File Upload PoPUp-------------
     * 
     * >> For file upload popUp , Always check in the DOM for the choosefile webelemnt must have type="file" 
     *    in the DOM structure then only the Selenium will able to interact or upload the file. 
     *    The tag name could be anything only attribute must have type="file".
     * 
     * 
     * >> Note : This is the only case where we use sendkeys over .click() method. 
     *           Bcuz in the upload file PopUp scenario we need to give the path which can be send by using sendkeys only.
     *           
     */

    public static void main(String[] args) {
        
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/upload");

       WebElement chhosefile = driver.findElement(By.cssSelector("#file-upload"));
       chhosefile.sendKeys("C:\\Users\\Ajith Kumar\\Downloads/Screenshot (63).png");

       driver.findElement(By.cssSelector("#file-submit")).click();
    }
}
