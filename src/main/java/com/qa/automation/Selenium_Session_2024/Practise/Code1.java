package com.qa.automation.Selenium_Session_2024.Practise;

public class Code1 {
    
    public static void main(String[] args) {
        
        // String str ="Ajit Kumar";

        
        // char ch[] =str.toCharArray();

        // char[] result = new char [str.length()];

        // for(int i=0;i< result.length;i++)

        //     result[i]= str[str.length -i - 1]; 

        //     System.out.println(new String(result));
        
        String input = "Automation Testing";
		
		// can be solved by coverting String to Char[]
		char[] str=input.toCharArray();
		char[] result = new char[str.length]; // craeted the new char[] array of the same size of prevoius converted String into char[] array.
		
		for (int i = 0; i < result.length; i++)  // not in reverse order bcuz we want to reverse the string at its own place.
			result[i] = str[str.length - i - 1];
		System.out.println(new String(result));

    }
}
