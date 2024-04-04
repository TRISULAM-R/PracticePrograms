package NewPackage.patterns;

public class Decreasing_pyramid 
{
	public static void main(String[] args) 
	{
		int row=10;
		String space = "  ";
		String symbol1="1";
		String symbol2=symbol1;
		for (int i = 1; i <= row; i++) 
		{
			for (int j = 0; j <i ; j++) 
			{
				System.out.print(space);
			}
			for (int j = i; j <= row; j++) 
			{
				System.out.print(symbol1+" ");
			}
			for (int j = i; j < row; j++) 
			{
				System.out.print(symbol2+" ");
			}		
			
			System.out.println();
		}
		
	}
}
