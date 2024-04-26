package com.qa.automation;

import org.testng.annotations.Test;

public class Test_Dependency {
    

@Test
public void searchProduct(){

    System.out.println("MacBook");
    int i =9/0;   // if this fails the dependent methods will not execute , so its advise not to make the test dependent on another test

}

@Test(dependsOnMethods = "searchProduct")
public void addToCart(){

    System.out.println("addTocarrt suscessfully");
}

@Test(dependsOnMethods = "addToCart")
public void makePayement(){

    System.out.println("Payement suscessfully");
}

}
