package practiceProg;

import java.util.*;

import org.testng.annotations.Test;

public class Array_Sort_Ascending {

	@Test
	public void sortArrayInAscending()
	{
		int[] arr = {12,52,43,44,65};
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i+1; j < arr.length; j++) {
				
				if(arr[i]>arr[j])
				{
					int temp =arr[j];
					arr[j]=arr[i];
					arr[i]= temp;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	@Test
	public void sortInAscending()
	{
		int[] arr = {1,26,3,45,37,23,5,35};
		
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	
	}
}
