package NewPackage.array_programs_without_using_sorting_mechanism;

public class First_and_Second_max_number_and_Third_without_using_sorting_mechanism 
{
	public static void main(String[] args) {
		int[] a = {-1,-1,-1,0,-2,-1,2,-3,-1,-1};
		int min =a[0];
		for (int i = 1; i < a.length; i++) {
			if (min>a[i]) {
				min=a[i];
			}
		}
		
		int fmax = min;
		int smax = min;
		int tmax = min;
		
		for (int i = 0; i < a.length; i++) 
		{
			if (a[i]>fmax) 
			{
				tmax=smax;
				smax = fmax;
				fmax = a[i];
			}else if (a[i]>smax) 
			{
				tmax=smax;
				smax = a[i];
			}else if (a[i]>tmax)
			{
				tmax=a[i];
			}
		}
		System.out.println(fmax +"  "+ smax+" "+tmax);
		
	}
}
