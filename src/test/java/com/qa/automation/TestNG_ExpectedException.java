package com.qa.automation;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;




public class TestNG_ExpectedException {
    
static WebDriver driver;


@Test(expectedExceptions = ArithmeticException.class)
public void loginTest(){ 
    System.out.println("Login Test ");
    int i = 10/0;
}





}
