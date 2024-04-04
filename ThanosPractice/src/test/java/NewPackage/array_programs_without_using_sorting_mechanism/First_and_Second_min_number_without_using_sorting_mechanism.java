package NewPackage.array_programs_without_using_sorting_mechanism;

public class First_and_Second_min_number_without_using_sorting_mechanism 
{
	public static void main(String[] args) {
		
			int[] a = {1,1,10,1,2,30,40,2,1,1};

			/** method 1 **/

			int fmin = a[0];
			int smin = a[0];
			
			for (int i = 0; i < a.length; i++) 
			{
				if (a[i]<=fmin) 
				{
					if(a[i]!=fmin)
					{
						smin = fmin;
					}
					fmin = a[i]; 
				}
				else if(fmin==smin || smin>a[i])
				{
					smin=a[i];
				}
			}
			
			System.out.println("first minimum = "+fmin);
			System.out.println("second minimum = "+smin);
			
			System.out.println("==========================================");
			
			/** method 2 **/
			
			int fmax = a[0];
			for (int i = 0; i < a.length; i++) 
			{
				if (fmax<a[i]) 
				{
					fmax = a[i];
				}
			}
			int fm = a[0];
			int sm = fmax;
			for (int i = 0; i < a.length; i++) 
			{
				if (fm>a[i]) 
				{
					sm=fm;
					fm=a[i];
				}
				else if (sm>a[i] & a[i]!=fm)
				{
						sm=a[i];
				}
			}
			System.out.println("first minimum = "+fm);
			System.out.println("second minimum = "+sm);
	}
}
