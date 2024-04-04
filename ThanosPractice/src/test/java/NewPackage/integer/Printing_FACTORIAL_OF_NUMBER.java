package NewPackage.integer;

public class Printing_FACTORIAL_OF_NUMBER 
{
	public static void main(String[] args) 
	{
		int number = 5;
		int fact = 1;
		if (number==0) 
		{
			System.out.println("factorial of "+number+" = 0");

		}else {
			for (int i = 2; i<=number; i++) 
			{
				fact = fact*i;
			}
			
			System.out.println("factorial of "+number+" = "+fact);
			
		}
			
	}
}
