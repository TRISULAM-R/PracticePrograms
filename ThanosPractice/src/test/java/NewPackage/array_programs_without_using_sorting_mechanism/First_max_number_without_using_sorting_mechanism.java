package NewPackage.array_programs_without_using_sorting_mechanism;

public class First_max_number_without_using_sorting_mechanism 
{
	public static void main(String[] args) {
		int[] a = {10,50,30,40,20,70};
		
		int max = a[0];
		
		for (int i = 1; i < a.length; i++) 
		{
			if (max<a[i]) 
			{
				max=a[i];
			}
		}
		
		System.out.println("First maximum number ==> "+max);
		

	}

}
