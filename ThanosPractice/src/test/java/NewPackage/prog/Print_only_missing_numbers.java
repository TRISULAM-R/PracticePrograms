package NewPackage.prog;

import java.util.LinkedHashSet;

public class Print_only_missing_numbers
{
	public static void main(String[] args) {
		
		int[] arr = {2,4,7,9};
		int max_num = arr[arr.length-1];
		int min_num = arr[0];
		
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		
		for (int i = min_num; i < max_num; i++)
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
				System.out.print(integer+" ");
			}
		}
	}
}
