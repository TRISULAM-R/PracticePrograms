package NewPackage.patterns;

public class Square 
{
	public static void main(String[] args) {
		String symbol = "#";
		int row = 10;
		int column = row;
		
		for (int i = 0; i < row ; i++)
		{
			for (int j = 0; j < column ; j++) 
			{
				System.out.print(symbol+" ");
			}
			System.out.println(" ");
		}
	}
}
