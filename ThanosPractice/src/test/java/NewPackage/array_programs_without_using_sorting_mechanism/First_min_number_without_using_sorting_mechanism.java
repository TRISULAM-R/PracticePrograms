package NewPackage.array_programs_without_using_sorting_mechanism;

public class First_min_number_without_using_sorting_mechanism 
{
	public static void main(String[] args) {
	
		int[] a = {10,50,30,40,20,5};
		
		int min = a[0];
		
		for (int i = 1; i < a.length; i++) 
		{
			if (min>a[i]) 
			{
				min=a[i];
			}
		}
		
		System.out.println("First minimum number ==> "+min);
	
    }
}
