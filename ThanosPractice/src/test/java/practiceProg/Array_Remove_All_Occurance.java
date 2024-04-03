package practiceProg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import org.testng.annotations.Test;

public class Array_Remove_All_Occurance {

	@Test
	public void approach1() {
		
		 int[] array = { 3, 9, 2, 3, 1, 7, 2, 3, 5 }; 
	        int key = 3; 
	        
	        ArrayList<Integer> list =new ArrayList();	        
	        for(int i=0; i<array.length; i++)
	        {
	        	if(key!=array[i])
	        	{
	        		list.add(array[i]);
	        	}
	        }
	        
	        for (int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i)+" ");
			}
	}
	
	@Test
	public void approach2() {
	
		 int[] array = { 3, 9, 2, 3, 1, 7, 2, 3, 5 }; 
	        int key = 3; 
	       
	        int index =0;
	        for(int i=0; i<array.length; i++)
	        {
	        	if(key!=array[i])
	        	{
	        		array[index++] = array[i];
	        	}
	        }
	       
	       int[] arr =Arrays.copyOf(array, index);
	        
	        for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]+" ");
			}
	}

}
