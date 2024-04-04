package NewPackage.tqes;

import java.util.LinkedHashSet;

public class CommondataInThreedifferentarray 
{
	public static void main(String[] args) {
// only print the common element in all three arrays which are of different length
		int[] arr1 = {20,10,15,5,6};
		int[] arr2 = {5,6,4,8,55,9,20};
		int[] arr3 = {5,8,6,6,95};
		
		LinkedHashSet<Integer> set1 = new LinkedHashSet<Integer>();
		
		int[] a = arr1;
		int[] b= null;
		if (arr2.length>a.length)
		{
			b=arr1;
			a=arr2;
		}
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < b.length; j++) 
			{
				if (a[i]==b[j])
				{
					set1.add(a[i]);
					
				}
			}
		}
		for (int intt : set1) 
		{
			for (int i = 0; i < arr3.length; i++)
			{
				if (intt==arr3[i]) {
					System.out.println(intt);
					break;
				}
			}
		}
	}
}
