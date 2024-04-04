package NewPackage.patterns;


public class Increasing_triangle 
{
	public static void main(String[] args) {

		String Symbol = "5";
		int row = 10;
		for (int i = 1; i <= row; i++) 
		{
			for (int j = 0; j < i; j++) 
			{
				System.out.print(Symbol+" ");
			}
			System.out.println(" ");
		}
		
		
	}
}
