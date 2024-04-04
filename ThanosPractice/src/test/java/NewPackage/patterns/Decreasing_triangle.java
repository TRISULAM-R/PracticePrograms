package NewPackage.patterns;

public class Decreasing_triangle
{
	public static void main(String[] args) {
		int row=10;
		String symbol = "5";
		for(int i=1;i<=row;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("  ");
			}
			for(int j=i;j<=row;j++)
			{
				System.out.print(symbol+" ");
			}
			System.out.println();
		}
	}
}
