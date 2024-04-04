package NewPackage.array_programs_without_using_sorting_mechanism;

public class First_and_Second_and_Third_min_number_without_using_sorting_mechanism 
{
	public static void main(String[] args) {
		
		int[] a = {1,1,10,1,2,30,40,2,1,1};
		
		int max = a[0];
		
		for (int i = 1; i < a.length; i++){
			if (max<a[i]) 
			{
				max = a[i];
			}
		}
		int fmin = max;
		int smin = max;
		int tmin = max;
		
		for (int i = 0; i < a.length; i++)
		{
			if (a[i]<fmin)
			{
				tmin = smin;
				smin = fmin;
				fmin = a[i];
			}
			else if (a[i]<smin & a[i]!=fmin) {
				tmin = smin;
				smin = a[i];
			}
			else if(a[i]<tmin & a[i]!=fmin & a[i]!=smin)
			{
				tmin = a[i];
			}
		}
		System.out.println("first minimum = "+fmin);
		System.out.println("second minimum = "+smin);
		System.out.println("third minimum = "+tmin);
	}
}
