package com.qa.automation;

import org.testng.annotations.Test;

public class CRUD_operation_TESTNG {
    


public void  createUser(){

    System.out.println("User Created");
}   


public void  getUser(){

    System.out.println("get the user");
}  


public void  updateUser(){

    System.out.println("Update the User");
}  


public void  deleteUser(){

    System.out.println("delete the User");
}  


@Test
public void CreateUserTest(){
    createUser();
}

@Test
public void getUserTest(){
    createUser();
    getUserTest();
    
}

@Test
public void updateUserTest(){
    createUser();
    getUserTest();
    updateUser();
   
}

@Test
public void deleteUserTest(){
   
    createUser();
    getUserTest();
    deleteUser();
    getUserTest();
    
}


}
