package NewPackage.prog;

public class QWERTY 
{
	public static void main(String[] args) 
	{
		boolean flag = true;
		int j=1;
		int count = 1;
		int count1 = 0;
		while(flag)
		{
			for (int i = j; i <= 10; i++)
			{
				System.out.print(i+" ");
				if(i==10)
				{
					flag=false;
				}
				
				count1++;
				if (count==count1)
				{
					System.out.println();
					j=i+1;
					count1=0;
					count++;
					break;
				}
				
			}
		}
		System.out.println();

		int no = 1;
		
		for (int i = 1; i <=4; i++)
		{
			for (int k = 0; k < i; k++) 
			{
				System.out.print(no+" ");
				no++;
			}
			System.out.println(" ");
		}
			
	}
}
