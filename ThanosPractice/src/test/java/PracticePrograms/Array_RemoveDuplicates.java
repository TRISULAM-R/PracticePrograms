package PracticePrograms;

import java.util.*;

public class Array_RemoveDuplicates {

	
	public static void main(String[] args) {
		
	int[] arr = {1,2,5,3,5,3,6,3,6};
	
	
	}
	
	//Approach - 1  Remove Duplicates Using LinkedHashSet
	private static void removeDuplicatesUsingLinkedHashSet(int[] arr)
	{
		Set<Integer> set=new LinkedHashSet();
		
		for(int i=0; i<arr.length;i++)
		{
			set.add(arr[i]);
		}
		
		for (Integer s : set) {
			System.out.print(s);
		}
	}
	
	//Approach - 2  
}
