package NewPackage.array_programs_without_using_sorting_mechanism;

public class Print 
{
	public static void main(String[] args) {
		int[] a = {1,1,10,2,30,40,1};

		int fmin = a[0];
		int smin = a[0];
		for (int i = 0; i < a.length; i++) 
		{
			if (a[i]<=fmin) 
			{
				if (a[i]!=fmin) 
				{
					smin = fmin;
				}
				fmin = a[i];
			}
		}
		System.out.println("first minimum = "+fmin);
		System.out.println("second minimum = "+smin);
		
	}
}
