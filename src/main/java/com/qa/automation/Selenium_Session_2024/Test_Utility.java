package com.qa.automation.Selenium_Session_2024;

public class Test_Utility {
    
    public static void main(String[] args) {
        
         Browser_Utility butil = new Browser_Utility();


         butil.InitDriver("chrome");
         butil.launchUrl("https://google.com");

        System.out.println(butil.getTitle());
         butil.QuitBroser();

        
        

         
    }
    




}
