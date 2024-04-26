package com.qa.automation;

import org.testng.annotations.Test;

public class InvocationCount_TestNG {
    

    @Test(invocationCount = 10)
    public void craeteUser(){

        System.out.println("Sucessfully created the users");
    }

}
