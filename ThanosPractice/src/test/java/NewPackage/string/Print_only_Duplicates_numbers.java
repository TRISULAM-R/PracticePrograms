package NewPackage.string;

import java.util.LinkedHashSet;

public class Print_only_Duplicates_numbers 
{
	public static void main(String[] args) {
		
		int[] arr = {2,7,9};
		
		int min = arr[0];
		int max = arr[arr.length-1];
		
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		
		for (int i = min; i <= max; i++)
		{
			set.add(i);
		}
		
		for (Integer integer : set)
		{
			int count = 0;
			for (int i = 0; i < arr.length; i++)
			{
				if (integer==arr[i])
				{
					count++;
				}
			}
			if (count==0)
			{
				System.out.println(integer);
			}
		}
		
	}
}
