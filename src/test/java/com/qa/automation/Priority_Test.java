package com.qa.automation;

import org.testng.annotations.Test;

public class Priority_Test {
    

@Test(priority = 1)
public void a_test(){

    System.out.println("Test a");
}

@Test (priority =0)
public void b_test(){

    System.out.println("Test b");
}

@Test (priority = -1)
public void c_test(){

    System.out.println("Test c");
}

@Test (priority =2)
public void d_test(){

    System.out.println("Test d");
}

@Test (priority =3)
public void e_test(){

    System.out.println("Test e");
}






}
