package NewPackage.patterns;

public class Pattern_assign
{
	public static void main(String[] args) {
		
		int row =9;
		for (int i = 1; i <= row; i++)
		{
			for (int j = i; j < row; j++)
			{
				System.out.print("  ");
			}
			for (int j = 1; j < i; j++)
			{
				System.out.print(j+" ");
			}
			for (int j = i; j > 0; j--)
			{
				System.out.print(j+" ");
			}

			System.out.println();
		}
	}
}
