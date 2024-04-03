package practiceProg;

import java.util.Arrays;
import java.util.Iterator;

import org.testng.annotations.Test;

public class Array_Check_2_Arrays_Equal {

	@Test
	public void approach1() {
		
		  // Initializing the first array 
        int a[] = { 30, 25, 40 }; 
  
        // Initializing the second array 
        int b[] = { 30, 25, 40 }; 
        
        boolean flag = true;
        if(a.length == b.length)
        {
	        for (int i = 0; i < a.length; i++) {
				if(a[i]!=b[i])
				{
					flag = false;
					break;
				}
			}
        }
        else {
        	flag = false;
        }
       
        if(flag)
        {
        	System.out.println(Arrays.toString(a)+ " and " + Arrays.toString(b)+ " Arrays are equal");
        }
        else {
			System.out.println(Arrays.toString(a)+ " and " + Arrays.toString(b)+ " Arrays are not equal");
		}
	}
	
	@Test
	public void approach2()
	{
		 // Initializing the first array 
        int a[] = { 30, 25, 40, 23 }; 
  
        // Initializing the second array 
        int b[] = { 30, 26, 40 }; 
  
        // Arrays.equals(a, b) function is used to check whether two arrays are equal or not 
        boolean result = Arrays.equals(a, b); 
  
        // condition to check whether the result is true or false 
        if (result == true) { 
            System.out.println("Two arrays are equal"); 
        } 
        else { 
            System.out.println("Two arrays are not equal"); 
        } 
	}
}
