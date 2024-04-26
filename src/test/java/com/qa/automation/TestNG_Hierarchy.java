package com.qa.automation;



import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/*----------------  Hierarrchy in TestNG--------------------------
@BeforeSuite.
@BeforeTest.
@BeforeClass.
@BeforeMethod.
@Test.
@AfterMethod.
@AfterClass.
@AfterTest
 */

public class TestNG_Hierarchy {
    
    //1
    @BeforeSuite
       public void DBConnection(){
        System.out.println("DB connected Sucesfuuly");
    }

    //2
    @BeforeTest
    public void createUser(){
        System.out.println("Create the User");
    }

    //3
    @BeforeClass
    public void LaunchBrowser(){
        System.out.println("Browser Launched");
    }
    
    //4
    @BeforeMethod
    public void LoginToAPP(){
        System.out.println("Logged in to app");
    }

    //5
    @Test
    public void homePageTitleTest(){
        System.out.println("homePage tile page passed");
    }

    //6
    @AfterMethod
    public void  logout(){
    System.out.println("looged out from the application");
    }

    //7 
    @AfterClass
    public void closeBrowser(){
     System.out.println("Browser Closed");
    }

    //8
    @AfterTest
    public void DeleteUser(){
    System.out.println("User Deleted");
    }

    //9
    @AfterSuite
    public void ClosedDbConnection(){
    System.out.println("DB connection closed");
    }


}
