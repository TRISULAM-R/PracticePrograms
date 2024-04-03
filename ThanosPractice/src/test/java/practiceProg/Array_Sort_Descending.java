package practiceProg;

import java.util.Arrays;
import java.util.Collections;

import org.testng.annotations.Test;

public class Array_Sort_Descending {

	@Test
	public void sortInDscending()
	{
		int[] arr = {12,52,43,44,65};
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]<arr[j])
				{
					int temp = arr[j];
					arr[j]= arr[i];
					arr[i]= temp;
				}
			}
		}
		
		for(int i=0; i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	@Test
	public void sortArrayDescenading()
	{
		int[] arr = {12,52,43,44,65};
		
		Arrays.sort(arr);
		
		  for(int i = 0; i < arr.length / 2; i++) {
	            int temp = arr[i];
	            arr[i] = arr[arr.length - i - 1];
	            arr[arr.length - i - 1] = temp;
	        }
		
		System.out.println(Arrays.toString(arr));
	}
}
