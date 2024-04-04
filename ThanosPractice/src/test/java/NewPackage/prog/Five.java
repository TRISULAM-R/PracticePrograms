package NewPackage.prog;

public class Five
{
	public static void main(String[] args)
	{
	
		/** Method 1 **/
		
		for (int i = 0; i <= 100; i++)
		{
			if (i%5==0 & i%10!=0)
			{
				System.out.println(i+"  this number ends with 5");
			}		
		}
		
		System.out.println(" ");
		System.out.println("==============================================");
		System.out.println(" ");
		
		/** Method 2 **/
		
		for (int i = 0; i < 100 ; i++) 
		{
			if (i%10==5) 
			{
				System.out.println(i+"  this number ends with 5");
			}
		}
	}
}
