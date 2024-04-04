package NewPackage.prog;

public class Prime_numbers 
{
	public static void main(String[] args) 
	{
		int[] arr = {2,3,4,5,6,7};
		
		for (int i = 0; i < arr.length; i++) 
		{
			boolean flag = false;
			int num = arr[i];
			for (int j = 2; j < num; j++) 
			{
				if (num%j==0) 
				{
					flag = true;
				}
			}
			
			if (!flag)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
	
}
